package com.sunny.beans.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author sunny
 * @className com.sunny.beans.factory.CarFactoryBean
 * @date 2017-12-22 15:16
 * @description:
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return bean对象
     * @throws Exception 异常
     */
    @Override
    public Car getObject() throws Exception {
        return new Car(brand, 40000);
    }

    /**
     * @return bean的类型
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * @return 是否单例
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
