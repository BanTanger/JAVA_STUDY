package com.bantanger.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("不动牛星", 22, '男');
        Person person2 = new Person("不动牛星", 22, '男');
        System.out.println(person2 == person1);
        System.out.println("=======================");
        System.out.println(person2.equals(person1));
        System.out.println("=======================");
        // == 当直接输出一个对象时，toString 方法会被默认调用 ==
        System.out.println(person1); // 等价于 person1.toString()
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    // 重写object 的 equals 方法
    public boolean equals(Object obj) {
        // 判断如果比较的两个对象是同一个对象，则直接返回 true
        if (this == obj)
            return true;
        // 类型判断
        if (obj instanceof Person) {
            // instanceof 判断的是运行内存，但 obj的编译类型还是Object
            // 调用类成员是发生在编译阶段，看的是编译类型。所以传入的是Object
            // 向下转型
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        // 如果不是 com.bantanger.object_.Person 直接返回false。
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}