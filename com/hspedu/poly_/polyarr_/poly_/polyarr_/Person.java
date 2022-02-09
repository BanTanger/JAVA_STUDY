package com.hspedu.poly_.polyarr_;

public class Person {
    private String name;
    private int age;

    // Say 方法
    public String say() { // 返回名字和年龄
        return name + "\t" + age;
    }

    // Set and Get
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void teaching() {
        System.out.println("老师 正在教书-------");
    }
}
