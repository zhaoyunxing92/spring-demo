package com.sunny.beans.relation;

import com.sunny.beans.autowire.Address;
import com.sunny.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.autowire.Main
 * @date 2017-11-09 17:51
 * @description: bean之间的依赖关系
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");

        Address address = (Address) ctx.getBean("address");

        Address address2 = (Address) ctx.getBean("address2");

        Address address3 = (Address) ctx.getBean("address3");

        System.out.println(address);
        System.out.println(address2);
        System.out.println(address3);


        Person person= (Person) ctx.getBean("person");
        System.out.println(person);

    }
}
