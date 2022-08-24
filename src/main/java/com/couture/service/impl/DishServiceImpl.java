package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.Dish;
import com.couture.mapper.DishMapper;
import com.couture.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description:
 */
@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {

}
