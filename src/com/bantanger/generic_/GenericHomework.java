package com.bantanger.generic_;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class GenericHomework {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",10000,new MyDate(12,1,1999)));
        employees.add(new Employee("dack",10000,new MyDate(12,1,1999)));
        employees.add(new Employee("king",65000,new MyDate(1,29,1947)));
        employees.add(new Employee("smith",10000,new MyDate(4,16,1987)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 传入参数校验
                if (!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
                // 改进
                /*if (o1.getName().equals(o2.getName())){
                    if (o1.getBirthday().getYear() - o2.getBirthday().getYear() != 0){
                        return o1.getBirthday().getYear() - o2.getBirthday().getYear();
                    }else if (o1.getBirthday().getMonth() - o2.getBirthday().getMonth() != 0){
                        return o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                    }else{
                        return o1.getBirthday().getDay() - o2.getBirthday().getDay();
                    }
                }
                return o1.getName().compareTo(o2.getName());*/

                // 面向对象 思想
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
// MyDate实现泛型接口，使得可以重写compareTo方法
class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return month == myDate.month && day == myDate.day && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        int monthMinus = month - o.getMonth();
        int datMinus = day - o.getDay();
        if (yearMinus != 0){
            return yearMinus;
        }else if (monthMinus != 0){
            return monthMinus;
        }else{
            return datMinus;
        }
    }
}
class Employee{
    private String name;
    private int sal;
    private MyDate birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return sal == employee.sal && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }

    @Override
    public String toString() {
        return "\n"+ "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}
