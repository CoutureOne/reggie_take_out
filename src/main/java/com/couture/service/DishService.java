package com.couture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.couture.dto.DishDto;
import com.couture.entity.Dish;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description:
 */
public interface DishService extends IService<Dish> {

    /**
     * 新增菜品
     * @param dishDto 菜品
     */
    void saveWithFlavor(DishDto dishDto);
}
