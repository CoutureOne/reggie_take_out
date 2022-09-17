package com.couture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.couture.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Couture
 * @data: 2022/9/17
 * @description:
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
