package com.sunny.beans.annotation.repository.impl;

import com.sunny.beans.annotation.repository.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.repository.UserJdbcRepository
 * @date 2017-12-23 21:26
 * @description:
 */
 @Repository
public class UserJdbcRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save ...");
    }
}
