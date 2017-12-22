package com.sunny.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author sunny
 * @className com.sunny.beans.properties.Main
 * @date 2017-12-22 10:24
 * @description: 读取外部properties文件
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");

        javax.sql.DataSource dataSource= (javax.sql.DataSource) ctx.getBean("dataSourceProperties");
        
        System.out.println(dataSource);

    }
}
