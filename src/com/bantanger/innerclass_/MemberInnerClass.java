package com.bantanger.innerclass_;

public class MemberInnerClass {
    public static void main(String[] args) {
        // 外部其他类访问成员内部类的三种方式
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
class Outer{
    private int n = 10;
    public String name = "张三";
    private void hi(){
        System.out.println("hi() 的方法...");
    }
    public class Inner{ // 成员内部类 修饰符可以是public private
        private double sal = 99.8;
        private int n = 66;
        public void say(){
            System.out.println("name "+name + " 访问外部类 n "+Outer.this.n + " sal "+sal);
            hi();
        }
    }
}
