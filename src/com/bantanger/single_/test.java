package com.bantanger.single_;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.Area());
    }
}
class Circle{
    // 三种方法对final修饰的属性进行赋值
    private double radius;
    private final double PI = 3.14;
    private final double PI2;
    private final double PI3;
    {
        PI2 = 3.14;
    };

    public Circle(double radius) {
        this.radius = radius;
        PI3 = 3.14;
    }
    public double Area(){
        return PI * radius * radius;
    }

}
