package com.hspedu.poly_.polyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double mouth_salary, double bonus) {
        super(name, mouth_salary);
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理"+ getName() +"正在管理-----");
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
