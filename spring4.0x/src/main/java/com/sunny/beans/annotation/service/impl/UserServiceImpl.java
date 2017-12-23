package com.sunny.beans.annotation.service.impl;

import com.sunny.beans.annotation.repository.UserRepository;
import com.sunny.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.service.impl.UserServiceImpl
 * @date 2017-12-22 15:44
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    //    @Autowired
//   // @Qualifier("userRepositoryImpl")  //指定使用哪个bean
//    public void setUserRepository(UserRepository userRepositoryImpl) {
//        this.userRepository = userRepositoryImpl;
//    }
    @Autowired
    @Qualifier("userRepositoryImpl")  //指定使用哪个bean
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void add() {
        userRepository.save();
        System.out.println("UserService add ...");
    }
}
