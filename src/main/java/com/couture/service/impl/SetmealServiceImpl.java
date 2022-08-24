package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.Setmeal;
import com.couture.mapper.SetmealMapper;
import com.couture.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/8/24
 * @description:
 */
@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
