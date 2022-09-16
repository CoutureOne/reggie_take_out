package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.AddressBook;
import com.couture.mapper.AddressBookMapper;
import com.couture.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/9/16
 * @description:
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
