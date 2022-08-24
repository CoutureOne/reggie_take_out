package com.couture.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.common.CustomException;
import com.couture.entity.Category;
import com.couture.entity.Dish;
import com.couture.entity.Setmeal;
import com.couture.mapper.CategoryMapper;
import com.couture.service.CategoryService;
import com.couture.service.DishService;
import com.couture.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/8/23
 * @description: 分类的实现方法
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，删除之前需要进行判断
     *
     * @param id 类型的id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        if (count1 > 0) {
            // 关联菜品，抛出一个异常
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count2 = setmealService.count();
        if (count2 > 0) {
            // 关联套餐抛出一个异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
        // 正常删除分类
        super.removeById(id);
    }
}
