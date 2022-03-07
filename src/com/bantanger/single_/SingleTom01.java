package com.bantanger.single_;

public class SingleTom01 {
    public static void main(String[] args) {
        //System.out.println(Cat.getInstance());
        System.out.println(Cat.n);
    }
}

/*
单例设计模式之饿汉模式
 */
class Cat{
    private String name;
    public static int n = 100; // 静态属性
    private static Cat cat = new Cat("妞妞"); // 静态对象 提供公共方法去调用

    // 1.构造器私有化
    // 2.定义static静态属性对象
    // 3.提供公共静态方法

    private Cat(String name) {
        System.out.println("构造器被调用---");
        this.name = name;
    }

    public static Cat getInstance(){
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
