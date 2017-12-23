package com.sunny.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.repository.UserJdbcRepository
 * @date 2017-12-23 21:26
 * @description:
 */
 @Repository
public class UserJdbcRepository implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save ...");
    }
}
