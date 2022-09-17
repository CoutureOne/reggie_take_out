package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.OrderDetail;
import com.couture.mapper.OrderDetailMapper;
import com.couture.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/9/17
 * @description:
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
