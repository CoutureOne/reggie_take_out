package com.couture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.couture.entity.User;
import com.couture.mapper.UserMapper;
import com.couture.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Couture
 * @data: 2022/9/13
 * @description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
