package com.bantanger.set.Homework01;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new com.bantanger.set.Homework01.Employee("jack",18));
        hashSet.add(new com.bantanger.set.Homework01.Employee("jack",18));
        hashSet.add(new com.bantanger.set.Homework01.Employee("jack",19));
        hashSet.add(new com.bantanger.set.Homework01.Employee("ajdla",48));
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.bantanger.set.Homework01.Employee employee = (com.bantanger.set.Homework01.Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
