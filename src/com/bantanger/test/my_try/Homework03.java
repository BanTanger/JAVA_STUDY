package com.bantanger.test.my_try;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("我我我",35,"老师",15000);
        Teacher professor = new Professor("nini",35,"教授",11000);
        Teacher associate_professor = new Associate_Professor("停放",30,"副教授",15000);
        Teacher lecturer = new lecturer("塔塔",45,"讲师",157990);

        System.out.println(teacher.introduce());
        System.out.println(associate_professor.introduce());
        System.out.println(professor.introduce());
        System.out.println(lecturer.introduce());
    }
}
class Teacher {
   private String name;
   private int age;
   private String post;
   private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public String introduce(){
        return "教师 " + name + "年龄 "+ age + "职称 " + post + "基本工资 "+ salary;
    }
}
class Professor extends Teacher{
    public Professor() {
    }

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public String introduce() {
       return super.introduce() + "工资级别1.3";
    }
}
class Associate_Professor extends Teacher{
    public Associate_Professor() {
    }

    public Associate_Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public String introduce() {
        return super.introduce() + "工资级别1.2";
    }
}
class lecturer extends Teacher{
    public lecturer() {
    }

    public lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public String introduce() {
        return super.introduce() + "工资级别1.1";
    }
}
