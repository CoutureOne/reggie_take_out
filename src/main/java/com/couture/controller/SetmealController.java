package com.couture.controller;

import com.couture.common.R;
import com.couture.dto.SetmealDto;
import com.couture.entity.SetmealDish;
import com.couture.mapper.SetmealDishMapper;
import com.couture.service.SetmealDishService;
import com.couture.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Couture
 * @data: 2022/9/12
 * @description: 套餐管理
 */
@RestController
@RequestMapping("/setmeal")
@Slf4j
public class SetmealController {
    @Autowired
    private SetmealService setmealService;

    @Autowired
    private SetmealDishMapper setmealDishMapper;

    /**
     * 新增套餐
     *
     * @param setmealDto 套餐
     * @return 新增结果
     */
    @PostMapping
    public R<String> save(@RequestBody SetmealDto setmealDto) {
        log.info("套餐信息：{}", setmealDto);

        setmealService.saveWithDish(setmealDto);

        return R.success("新增套餐成功");
    }
}
