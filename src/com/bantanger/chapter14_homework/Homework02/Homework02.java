package com.bantanger.chapter14_homework.Homework02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        arrayList.add(car);
        arrayList.add(car2);
        // contains 查看元素是否存在
        System.out.println(arrayList.contains(car));

        //size 获取元素个数
        System.out.println(arrayList.size());

        // isEmpty
        System.out.println(arrayList.isEmpty());

        // clear
        arrayList.clear();

        // addAll 添加多个元素
        Car car1 = new Car("牛逼",1564666);
        Car car4 = new Car("武林宏观",1153406);
        Car car3 = new Car("大众",6487666);
        arrayList.add(car1);
        arrayList.add(car3);
        arrayList.add(car4);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        // containsAll
        System.out.println(arrayList.containsAll(arrayList));

        // 使用增强for和迭代器遍历所有car
        for (Object o : arrayList) {
            // 向下转型为Car
            /*Car x = (Car) o;
            x.getName();*/
            System.out.println(o);
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        // removeAll
        arrayList.removeAll(arrayList);


    }
}

class Car {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "\n" + name + "\t" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
