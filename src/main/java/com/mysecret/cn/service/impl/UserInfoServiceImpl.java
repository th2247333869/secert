package com.mysecret.cn.service.impl;

import com.mysecret.cn.entity.UserInfo;
import com.mysecret.cn.mapper.UserInfoMapper;
import com.mysecret.cn.service.UserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基础信息表 服务实现类
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
