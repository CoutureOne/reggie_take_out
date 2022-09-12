package com.couture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.couture.dto.SetmealDto;
import com.couture.entity.Setmeal;

import java.util.List;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description:
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时还需要删除套餐和菜品的关联数据
     *
     * @param ids
     */
    void removeWithDish(List<Long> ids);
}
