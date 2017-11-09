package com.sunny.beans;

import com.sunny.beans.conllections.MapPerson;
import com.sunny.beans.di.Car;
import com.sunny.beans.properties.DataSource;
import com.sunny.beans.reference.Person;
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
        helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.hello();

        Car car = (Car) ctx.getBean("car");

        System.out.println(car.toString());
        System.out.println("=============================");
        
        car = (Car) ctx.getBean("car2");

        System.out.println(car.toString());
        System.out.println("=============================");

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        System.out.println("=============================");
        person = (Person) ctx.getBean("person2");
        System.out.println(person);

        System.out.println("=============================");
        person = (Person) ctx.getBean("person3");

        System.out.println(person);
        System.out.println("=============================");

        person = (Person) ctx.getBean("person4");
        System.out.println(person);
        System.out.println("=============================");

        /**集合属性赋值*/
        com.sunny.beans.conllections.Person conllectionsPerson = (com.sunny.beans.conllections.Person) ctx.getBean("conllectionsPerson");
        System.out.println(conllectionsPerson);
        System.out.println("=============================");

        conllectionsPerson= (com.sunny.beans.conllections.Person) ctx.getBean("person5");
        System.out.println(conllectionsPerson);
        System.out.println("=============================");

        MapPerson mapPerson= (MapPerson) ctx.getBean("mapPerson");
        System.out.println(mapPerson);

        System.out.println("=============================");
        DataSource dataSource= (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

        System.out.println("=============================");
        person= (Person) ctx.getBean("person6");
        System.out.println(person);
        System.out.println("=============================");



    }
}
