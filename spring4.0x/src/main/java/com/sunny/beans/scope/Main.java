package com.sunny.beans.scope;

import com.sunny.beans.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.scope.Main
 * @date 2017-11-12 03:03
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");

        Car car = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");
        
        System.out.println(car == car2);
    }
}
