package com.sunny.beans.conllections;

import com.sunny.beans.di.Car;

import java.util.Map;

/**
 * @author sunny
 * @className com.sunny.beans.conllections.MapPerson
 * @date 2017-11-09 13:32
 * @description:  配置map属性值
 */
public class MapPerson {
    /**姓名*/
    private String name;
    /**年龄*/
    private int age;
    /**汽车*/
    private Map<String,Car> cars;

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

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "MapPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
