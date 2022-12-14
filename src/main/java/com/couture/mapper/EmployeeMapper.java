package com.couture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.couture.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Couture
 * @data: 2022/8/21
 * @description:
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
