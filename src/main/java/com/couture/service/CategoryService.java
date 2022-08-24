package com.couture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.couture.entity.Category;

/**
 * @author Couture
 * @data: 2022/8/23
 * @description:
 */
public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
