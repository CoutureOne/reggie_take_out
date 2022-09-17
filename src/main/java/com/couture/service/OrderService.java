package com.couture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.couture.entity.Orders;

/**
 * @author Couture
 * @data: 2022/9/17
 * @description:
 */
public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    void submit(Orders orders);
}
