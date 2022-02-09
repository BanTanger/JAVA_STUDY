package com.hspedu.poly_.polyparameter_;

public class Employee {
    public String name;
    private double Mouth_salary;

    public Employee() {
    }

    public Employee(String name, double mouth_salary) {
        this.name = name;
        Mouth_salary = mouth_salary;
    }

    public double getAnnual() {
        return Mouth_salary * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMouth_salary() {
        return Mouth_salary;
    }

    public void setMouth_salary(double mouth_salary) {
        Mouth_salary = mouth_salary;
    }
}
