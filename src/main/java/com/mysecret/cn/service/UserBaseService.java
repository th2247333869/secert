package com.mysecret.cn.service;

import com.mysecret.cn.entity.UserBase;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户数据表 服务类
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
public interface UserBaseService extends IService<UserBase> {

    /**
     * 新增一条用户基本信息
     * @param userBase 用户基本信息对象
     * @return 成功对象的id
     */
    Long addUserBase(UserBase userBase);

}
