package com.mysecret.cn.web.login;

import com.google.common.base.Preconditions;
import com.mysecret.cn.dto.ResponseDTO;
import com.mysecret.cn.dto.type.ResponseDtoEnum;
import com.mysecret.cn.dto.RegisterUserDTO;
import com.mysecret.cn.entity.UserBase;
import com.mysecret.cn.entity.UserInfo;
import com.mysecret.cn.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @200606
 * @author tianhao
 */
@RestController
public class LoginController {


    /**
     * do register user info and base info
     * @param registerUserDTO
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/doRegister")
    public ResponseDTO doRegister(RegisterUserDTO registerUserDTO){
        // check param is or isn’t null
        Preconditions.checkNotNull(registerUserDTO);

        // return dto
        return ResponseDTO.of(ResponseDtoEnum.SUCCESS.getCode()).setData("");
    }

}