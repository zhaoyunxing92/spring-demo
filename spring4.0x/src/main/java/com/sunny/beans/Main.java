package com.sunny.beans;

import com.sunny.beans.di.ConstructorArgDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.Main
 * @date 2017-11-08 14:53
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 两个都实现  ApplicationContext 接口
         * ClassPathXmlApplicationContext  从类路径下加载配置文件
         * FileSystemXmlApplicationContext  从系统文件加载配置文件
         */

        // ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\code\\java\\springdemoroot\\spring4.0x\\src\\main\\resources\\applicationContext.xml");
        //通过id获取
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //通过类获取bean 但是不能保证唯一
        helloWorld=ctx.getBean(HelloWorld.class);
        helloWorld.hello();

        ConstructorArgDI constructorArgDI= (ConstructorArgDI) ctx.getBean("constructorArgDI");

        System.out.println(constructorArgDI.toString());

        constructorArgDI= (ConstructorArgDI) ctx.getBean("constructorArgDI2");

        System.out.println(constructorArgDI.toString());



    }
}
