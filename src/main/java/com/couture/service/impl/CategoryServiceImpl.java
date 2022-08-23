package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.Category;
import com.couture.mapper.CategoryMapper;
import com.couture.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/8/23
 * @description:
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
