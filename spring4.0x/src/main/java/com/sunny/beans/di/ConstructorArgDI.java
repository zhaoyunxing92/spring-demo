package com.sunny.beans.di;

/**
 * @author sunny
 * @className com.sunny.beans.di.ConstructorArgDI
 * @date 2017-11-08 22:13
 * @description: 通过构造器注入
 */
public class ConstructorArgDI {
    /**牌子*/
    private String brand;
    /**公司*/
    private String corp;
    /**价格*/
    private double price;
    /**最大速度*/
    private int maxSpeed;

    public ConstructorArgDI(String brand, String corp, double price) {
        super();
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public ConstructorArgDI(String brand, String corp, int maxSpeed) {
        super();
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "ConstructorArgDI{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
