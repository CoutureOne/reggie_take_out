package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.Employee;
import com.couture.mapper.EmployeeMapper;
import com.couture.service.EmployeeService;
import org.springframework.stereotype.Service;
/**
 * @author Couture
 * @data: 2022/8/23
 * @description:
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{

}

