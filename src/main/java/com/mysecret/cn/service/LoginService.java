package com.mysecret.cn.service;

import com.mysecret.cn.dto.RegisterUserDTO;
import com.mysecret.cn.entity.UserInfo;


/**
 * @date 200606
 * @author Administrator
 */
public interface LoginService {

    /**
     * 执行注册方法
     * @param registerUserDTO 注册对象dto
     * @exception 异常
     */
    public void doRegister(RegisterUserDTO registerUserDTO) throws Exception;

}