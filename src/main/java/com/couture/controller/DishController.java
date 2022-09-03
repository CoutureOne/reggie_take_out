package com.couture.controller;

import com.couture.common.R;
import com.couture.dto.DishDto;
import com.couture.service.CategoryService;
import com.couture.service.DishFlavorService;
import com.couture.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description: 菜品管理
 */
@Slf4j
@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 新增菜品
     *
     * @param dishDto 菜品
     * @return 新增菜品结果
     */
    @PostMapping
    public R<String> save(DishDto dishDto) {
        log.info(dishDto.toString());

        dishService.saveWithFlavor(dishDto);

        return R.success("新增菜品成功");
    }
}
