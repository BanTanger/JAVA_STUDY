package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Manager("不懂哎",30000,10000);
        employee[1] = new Manager("不哎",12340,10000);
        employee[2] = new Worker("懂哎",3456);
        employee[3] = new Worker("不",4631);
        employee[4] = new Employee("不...",73164);

    }
}
