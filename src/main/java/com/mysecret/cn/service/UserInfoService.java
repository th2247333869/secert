package com.mysecret.cn.service;

import com.mysecret.cn.entity.UserInfo;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户基础信息表 服务类
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
public interface UserInfoService extends IService<UserInfo> {

    /**
     * 新增用户信息
     * @param userInfo 用户信息obj
     * @return 新增成功个数
     */
    int addUserInfo(UserInfo userInfo);

}
