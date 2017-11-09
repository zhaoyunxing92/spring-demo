package com.sunny.beans.conllections;

import com.sunny.beans.di.Car;

import java.util.List;

/**
 * @author sunny
 * @className com.sunny.beans.reference.Person
 * @date 2017-11-09 09:19
 * @description: 集合属性赋值
 */
public class Person {
    /**姓名*/
    private String name;
    /**年龄*/
    private int age;
    /**汽车*/
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
