package com.couture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.couture.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Couture
 * @data: 2022/9/16
 * @description:
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
