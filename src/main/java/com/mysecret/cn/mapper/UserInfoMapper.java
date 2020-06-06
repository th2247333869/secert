package com.mysecret.cn.mapper;

import com.mysecret.cn.entity.UserInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户基础信息表 Mapper 接口
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
@Repository
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
