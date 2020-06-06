package com.mysecret.cn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.mysecret.cn.common.util.SecurityShaUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户数据表
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_base")
public class UserBase extends Model<UserBase> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long uid;
    /**
     * 用户账号，必须唯一
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户密码
     */
    @TableField("user_password")
    private String userPassword;
    /**
     * 用户密码
     */
    @TableField("user_salt")
    private String userSalt;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    /**
     * 加密
     * @throws Exception 异常
     */
    public void doUserPasswordSHA() throws Exception{
        userPassword =  SecurityShaUtils.shaEncode(userPassword);
    }
}
