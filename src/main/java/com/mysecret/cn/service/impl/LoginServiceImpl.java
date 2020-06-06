package com.mysecret.cn.service.impl;

import com.mysecret.cn.dto.RegisterUserDTO;
import com.mysecret.cn.entity.UserBase;
import com.mysecret.cn.entity.UserInfo;
import com.mysecret.cn.service.LoginService;
import com.mysecret.cn.service.UserBaseService;
import com.mysecret.cn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 200606
 * @author tianhao
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserBaseService userBaseService;
    @Autowired
    private UserInfoService userInfoService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void doRegister(RegisterUserDTO registerUserDTO) throws Exception{
        // dto convert entity
        UserBase userBase = registerUserDTO.inputConvertUserBase();
        // encrypt the password by sha
        userBase.doUserPasswordSHA();
        // save add user base
        Long uid = userBaseService.addUserBase(userBase);
        // creat a default user info
        UserInfo userInfo = UserInfo.builder()
                .uid(uid)
                .email(userBase.getUserName())
                .userRole(2)
                .registerSource(2)
                .pushToken(registerUserDTO.getIp())
                .build();
        // save add user info
        userInfoService.addUserInfo(userInfo);
    }
}