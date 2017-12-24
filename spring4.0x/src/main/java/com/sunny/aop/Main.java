package com.sunny.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.aop.Main
 * @date 2017-12-23 23:54
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");

        ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);

        int result = arithmeticCalculator.add(2, 5);
        System.out.println("result = " + result);

        result = arithmeticCalculator.div(10, 2);
        System.out.println("result = " + result);
    }
}
