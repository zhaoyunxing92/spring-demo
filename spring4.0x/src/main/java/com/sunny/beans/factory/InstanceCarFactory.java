package com.sunny.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunny
 * @className com.sunny.beans.factory.InstanceCarFactory
 * @date 2017-12-22 15:02
 * @description: 实例工程的方法  先创建工程本身，在调用工程的实例方法
 */
public class InstanceCarFactory {
    private static Map<String, Car> cars;

    public InstanceCarFactory() {
        cars = new HashMap<String, Car>();

        cars.put("audi", new Car("audi", 20000));
        cars.put("ford", new Car("ford", 40000));
    }

    public Car getCar(String name) {
        return cars.get(name);
    }
}
