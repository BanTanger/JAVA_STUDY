package com.hspedu.poly_.polyarr_;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //    重写父类 say 方法
    public String say() { // 返回名字和年龄
        return super.say() + " score=" + score;
    }

    public void studying() {
        System.out.println("学生 正在 学习---------");
    }
}
