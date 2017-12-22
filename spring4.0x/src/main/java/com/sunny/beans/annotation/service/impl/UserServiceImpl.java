package com.sunny.beans.annotation.service.impl;

import com.sunny.beans.annotation.repository.UserRepository;
import com.sunny.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.service.impl.UserServiceImpl
 * @date 2017-12-22 15:44
 * @description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void add() {
        userRepository.save();
        System.out.println("UserService add ...");
    }
}
