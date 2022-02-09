package com.bantanger.test.my_try;

public class Homework01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("我我我枪手",23,"枪手");
        people[1] = new Person("我我我大盗",43,"大盗");
        people[2] = new Person("我我我妹妹",13,"妹妹");
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
//                if(people[j].getAge() > people[j + 1].getAge()){
//                    Person tmp = people[j];
//                    people[j] = people[j + 1];
//                    people[j + 1] = tmp;
//                }
                // 按照名字长度
                if(people[j].getName().length() > people[j + 1].getName().length()){
                    Person tmp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
