package com.sunny.beans.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.cycle.Main
 * @date 2017-12-22 11:39
 * @description: bean的生命周期
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");

        Car car= (Car) ctx.getBean("car");
        System.out.println(car);

        //关闭容器
        ctx.close();
    }
}
