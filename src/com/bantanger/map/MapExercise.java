package com.bantanger.map;

import java.util.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Employee jack = new Employee("杰克", 1, 18200);
        Employee a = new Employee("杰克", 12, 46200);
        Employee x = new Employee("mike", 2, 16400);
        Employee y = new Employee("king", 3, 10000);
        Employee z = new Employee("tom", 4, 20000);
        hashMap.put(jack.getId(),jack);
        hashMap.put(a.getId(),a);
        hashMap.put(x.getId(),x);
        hashMap.put(y.getId(),y);
        hashMap.put(z.getId(),z);

        // 两种遍历方式
        // 1. 使用keySet --> 增强for
        Collection values = hashMap.values();
        Set hashset = hashMap.keySet();
        for (Object o : hashset) {
            Employee emp = (Employee) hashMap.get(o);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }

        System.out.println("======================");
        // 2. 使用EntrySet --> 迭代器
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            // 第一次向下转型 将Object 类型转成 Map.Entry 类型
            // 因为EntrySet 是编译类型 （大类型） 没有子类方便调用的getKey，getValue方法
            Map.Entry entry =(Map.Entry) iterator.next();
            // 转成Map.Entry 调用 getValue 方法来得到键值 --> Employee对象
            // getValue 方法得到的键值仍然是 Map.Entry 类型
            // 所以进行第二次向下转型 得到Employee 类型 --> 为了调用sal属性
            Employee emp = (Employee) entry.getValue();
            if (emp.getSal()>18000){
                System.out.println(emp);
            }
        }
    }
}
class Employee{
    private String name;
    private int id;
    private int sal;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && sal == employee.sal && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Employee(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
}
