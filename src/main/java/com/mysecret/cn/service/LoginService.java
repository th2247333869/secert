package com.mysecret.cn.service;

import com.mysecret.cn.dto.RegisterUserDTO;


/**
 * @date 200606
 * @author Administrator
 */
public interface LoginService {

    /**
     * 执行注册方法
     * @param registerUserDTO 注册对象
     * @throws Exception
     */
    void doRegister(RegisterUserDTO registerUserDTO) throws Exception;

}