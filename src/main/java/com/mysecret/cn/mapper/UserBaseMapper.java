package com.mysecret.cn.mapper;

import com.mysecret.cn.entity.UserBase;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户数据表 Mapper 接口
 * </p>
 *
 * @author tianhao
 * @since 2020-06-06
 */
@Repository
@Mapper
public interface UserBaseMapper extends BaseMapper<UserBase> {

}
