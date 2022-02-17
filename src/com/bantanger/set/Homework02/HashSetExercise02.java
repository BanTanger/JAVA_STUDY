package com.bantanger.set.Homework02;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class HashSetExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee02("jacvk",1540,new MyDate(2000,12,27)));
        hashSet.add(new Employee02("jacvk",1540,new MyDate(2000,12,27)));
        hashSet.add(new Employee02("jajdla",1540,new MyDate(2000,12,27)));
        hashSet.add(new Employee02("king",1540,new MyDate(20150,12,27)));
        System.out.println(hashSet);
    }
}
class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
class Employee02{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee02(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Double.compare(that.sal, sal) == 0 && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
