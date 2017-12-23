package com.sunny.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.generic.di.Main
 * @date 2017-12-23 22:08
 * @description: spring 4.0 泛型注入
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");

        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }
}
