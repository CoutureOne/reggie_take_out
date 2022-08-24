package com.couture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.couture.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description:
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
