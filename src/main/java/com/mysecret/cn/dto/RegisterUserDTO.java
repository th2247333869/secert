package com.mysecret.cn.dto;


import com.mysecret.cn.core.DtoConvert;
import com.mysecret.cn.entity.UserBase;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

/**
 * @date 200606
 * @author tianhao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserDTO {
    /**
     *用户名
     */
    @NotNull
    private String userName;

    /**
     *密码
     */
    @NotNull
    private String userPassword;

    /**
     *密码盐
     */
    private String userSalt;

    /**
     * 网络地址
     */
    @NotNull
    private String ip;

    /**
     * 转换当前对象和dto对象
     * @return 当前对象
     */
    public UserBase inputConvertUserBase(){
        RegisterUserVoConvert convert = new RegisterUserVoConvert();
        return convert.doForward(this);
    }

    private static class RegisterUserVoConvert extends DtoConvert<UserBase, RegisterUserDTO>{

        @Override
        public UserBase doForward(RegisterUserDTO registerUserDTO) {
            UserBase userBase = new UserBase();
            BeanUtils.copyProperties(registerUserDTO,userBase);
            return userBase;
        }

        @Override
        public RegisterUserDTO doBackForward(UserBase userBase) {
            throw new AssertionError("不支持逆向转化方法!");
        }
    }
}