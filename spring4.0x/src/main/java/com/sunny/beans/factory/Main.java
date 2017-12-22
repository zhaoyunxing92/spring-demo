package com.sunny.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.factory.Main
 * @date 2017-12-22 14:50
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);

        car1 = (Car) ctx.getBean("car2");
        System.out.println(car1);
    }
}
