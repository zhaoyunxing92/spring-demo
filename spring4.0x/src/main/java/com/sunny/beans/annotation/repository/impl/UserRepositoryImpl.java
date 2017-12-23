package com.sunny.beans.annotation.repository.impl;

import com.sunny.beans.annotation.repository.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.repository.impl.UserRepositoryImpl
 * @date 2017-12-22 15:42
 * @description:
 */


@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository save ...");
    }
}
