package com.mysecret.cn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户基础信息表
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@TableName("t_user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long uid;
    /**
     * 2正常用户 3禁言用户 4虚拟用户 5运营
     */
    @TableField("user_role")
    private Integer userRole;
    /**
     * 注册来源：1手机号 2邮箱 3用户名 
     */
    @TableField("register_source")
    private Integer registerSource;
    /**
     * 用户昵称
     */
    @TableField("nick_name")
    private String nickName;
    /**
     * 用户性别 0-female 1-male
     */
    private Integer gender;
    /**
     * 用户生日
     */
    private Long birthday;
    /**
     * 用户个人签名
     */
    private String signature;
    /**
     * 手机号码(唯一)
     */
    private String mobile;
    /**
     * 手机号码绑定时间
     */
    @TableField("mobile_bind_time")
    private Integer mobileBindTime;
    /**
     * 邮箱(唯一)
     */
    private String email;
    /**
     * 邮箱绑定时间
     */
    @TableField("email_bind_time")
    private Integer emailBindTime;
    /**
     * 头像
     */
    private String face;
    /**
     * 头像 200x200x80
     */
    private String face200;
    /**
     * 原图头像
     */
    private String srcface;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private String createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private String updateTime;
    /**
     * 用户设备push_token
     */
    @TableField("push_token")
    private String pushToken;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
