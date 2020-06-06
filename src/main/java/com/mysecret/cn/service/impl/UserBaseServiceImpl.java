package com.mysecret.cn.service.impl;

import com.mysecret.cn.entity.UserBase;
import com.mysecret.cn.mapper.UserBaseMapper;
import com.mysecret.cn.service.UserBaseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户数据表 服务实现类
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
@Service
public class UserBaseServiceImpl extends ServiceImpl<UserBaseMapper, UserBase> implements UserBaseService {

    /**
     * 用户基本信息数据层obj
     */
    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public Long addUserBase(UserBase userBase) {
        // add a userBase object
        userBaseMapper.insert(userBase);
        return  userBase.getUid();
    }
}
