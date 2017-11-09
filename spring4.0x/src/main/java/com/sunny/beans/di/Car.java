package com.sunny.beans.di;

/**
 * @author sunny
 * @className com.sunny.beans.di.Car
 * @date 2017-11-08 22:13
 * @description: 通过构造器注入
 */
public class Car {
    /**牌子*/
    private String brand;
    /**公司*/
    private String corp;
    /**价格*/
    private double price;
    /**最大速度*/
    private int maxSpeed;

    public Car(String brand, String corp, double price) {
        super();
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxSpeed) {
        super();
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
