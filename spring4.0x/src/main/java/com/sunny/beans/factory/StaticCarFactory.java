package com.sunny.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunny
 * @className com.sunny.beans.factory.StaticCarFactory
 * @date 2017-12-22 14:36
 * @description: 静态工程方法创建bean ，直接用类的静态方法就可以返回bean的实例
 */
public class StaticCarFactory {
    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi", new Car("audi", 20000));
        cars.put("ford", new Car("ford", 40000));
    }

    public static Car getCar(String name) {
        return cars.get(name);
    }
}
