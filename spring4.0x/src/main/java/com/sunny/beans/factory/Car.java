package com.sunny.beans.factory;

/**
 * @author sunny
 * @className com.sunny.beans.autowire.Car
 * @date 2017-11-09 17:40
 * @description:
 */
public class Car {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
