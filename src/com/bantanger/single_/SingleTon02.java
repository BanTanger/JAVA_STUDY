package com.bantanger.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        // Dog instance = Dog.getInstance();
        // System.out.println(instance);
        System.out.println(Dog.n); // 直接调用静态属性是不会调用构造器
    }
}
/*
单例设计模式之懒汉模式
    相较于饿汉模式，将实例化对象放在了公共静态方法里，如果需要就new，更加节省内存
    但缺点就是懒汉式会存在线程的安全问题    而饿汉式不会
 */

class Dog{
    private String name;
    public static int n = 100;
    private static Dog dog; // 创建对象，但不实例化 new

    private Dog(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    // 公共方法
    public static Dog getInstance(){
        if(dog == null){
            dog = new Dog("you");
        }
        return dog;
    }
}