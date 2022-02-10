package com.bantanger.test.my_try.Homework13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public String teach() {
       return "我承诺，我会认真教学。";
    }

    @Override
    public String play() {
        return super.play() + " 象棋";
    }

    public String toString() {
        return  "姓名:" + super.getName() + "\n" +
                "性别:" + super.getSex() + "\n" +
                "年龄:" + super.getAge() + "\n" +
                "工龄:" + work_age + "\n"
                + play() ;
    }
}
