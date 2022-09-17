package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.ShoppingCart;
import com.couture.mapper.ShoppingCartMapper;
import com.couture.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/9/17
 * @description:
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService{
}
