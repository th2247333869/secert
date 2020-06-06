package com.mysecret.cn.service.impl;

import com.mysecret.cn.dto.RegisterUserDTO;
import com.mysecret.cn.entity.UserBase;
import com.mysecret.cn.entity.UserInfo;
import com.mysecret.cn.service.LoginService;
import com.mysecret.cn.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 200606
 * @author tianhao
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserBaseService userBaseService;

    @Transactional
    @Override
    public void doRegister(RegisterUserDTO registerUserDTO) {
        // dto convert entity
        UserBase userBase = registerUserDTO.inputConvertUserBase();
        // do add user base
        Long uid = userBaseService.addUserBase(userBase);
        // creat a default user info
        //UserInfo userInfo = UserInfo.builder().uid(uid).email(userBase.getUserName());
    }
}