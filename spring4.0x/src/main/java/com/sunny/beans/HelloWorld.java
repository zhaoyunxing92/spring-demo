package com.sunny.beans;

/**
 * @author sunny
 * @className com.sunny.beans.HelloWorld
 * @date 2017-11-08 14:48
 * @description:
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello " + name);
    }
}
