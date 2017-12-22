package com.sunny.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.autowire.Main
 * @date 2017-11-09 17:51
 * @description:  bean自动装配
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");

        Person person= (Person) ctx.getBean("person");
        System.out.println(person);

        System.out.println("====================================");
        person= (Person) ctx.getBean("person2");
        System.out.println(person);
    }
}
