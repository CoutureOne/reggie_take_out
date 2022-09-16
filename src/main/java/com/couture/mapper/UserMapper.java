package com.couture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.couture.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Couture
 * @data: 2022/9/13
 * @description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
