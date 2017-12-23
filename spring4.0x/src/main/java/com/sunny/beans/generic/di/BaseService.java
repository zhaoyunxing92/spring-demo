package com.sunny.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sunny
 * @className com.sunny.beans.generic.di.BaseService
 * @date 2017-12-23 22:01
 * @description:
 */
public class BaseService<T> {
    @Autowired
    private BaseRepository<T> repository;

    public void add() {
        System.out.println("add ...");
        System.out.println(repository);
    }
}
