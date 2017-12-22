package com.sunny.beans.cycle;

/**
 * @author sunny
 * @className com.sunny.beans.cycle.Car
 * @date 2017-12-22 11:33
 * @description:   bean的生命周期
 */
public class Car {
    public Car() {
        System.out.println("car's constructor...");
    }
    private String brand;

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("【注入属性】注入属性brand");
        this.brand = brand;
    }

    public void init(){
        System.out.println("init....");
    }

    public void destroy(){
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
