package com.bantanger.reflection.question;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Cat {
    public String name = "招财猫";
    public int age = 30;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hi(){
        System.out.println("hi Cat");
    }
}
