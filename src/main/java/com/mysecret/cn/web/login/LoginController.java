package com.mysecret.cn.web.login;

import com.google.common.base.Preconditions;
import com.mysecret.cn.common.util.IpUtils;
import com.mysecret.cn.dto.ResponseDTO;
import com.mysecret.cn.dto.type.ResponseDtoEnum;
import com.mysecret.cn.dto.RegisterUserDTO;
import com.mysecret.cn.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @date 200606
 * @author tianhao
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;
    /**
     * do register user info and base info
     * @param registerUserDTO 用户注册dto
     * @param request 请求 obj
     * @return 返回dto
     */
    @CrossOrigin
    @PostMapping(value = "/doRegister")
    public ResponseDTO doRegister(@RequestBody RegisterUserDTO registerUserDTO, HttpServletRequest request){
        // check param is or isn’t null
        Preconditions.checkNotNull(registerUserDTO);
        //set ip to registerUserDTO
        registerUserDTO.setIp(IpUtils.getIpAddr(request));
        //do register
        try {
            loginService.doRegister(registerUserDTO);
        }catch (Exception e){
            e.printStackTrace();
            // return dto
            return ResponseDTO.of(ResponseDtoEnum.ERROR.getCode()).setData(e.getMessage());
        }
        // return dto
        return ResponseDTO.of(ResponseDtoEnum.SUCCESS.getCode()).setData("");
    }

}