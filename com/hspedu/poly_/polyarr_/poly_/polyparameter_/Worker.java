package com.hspedu.poly_.polyparameter_;

public class Worker extends Employee{
    public Worker() {
    }
    public Worker(String name, double mouth_salary) {
        super(name, mouth_salary);
    }
    public void work() {
        System.out.println("员工"+ getName() +"正在工作");
    }
    public double getAnnual() {
        return super.getAnnual();
    }

}
