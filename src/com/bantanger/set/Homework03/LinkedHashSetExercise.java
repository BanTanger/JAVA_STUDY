package com.bantanger.set.Homework03;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奔驰",120000));
        linkedHashSet.add(new Car("奔驰",120000));
        linkedHashSet.add(new Car("驰奔",120000));
        linkedHashSet.add(new Car("驰",120000));
        System.out.println(linkedHashSet);
    }
}
class Car {
    private String name;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}