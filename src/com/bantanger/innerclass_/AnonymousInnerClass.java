package com.bantanger.innerclass_;

/**
 * 解决为了实现接口 多次定义类 但类只需要使用一次的情况
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        /**
         *  想使用IA接口 并创建对象
         *  传统方式 写一个类 实现接口的方法，并创建对象
         *  如今，使用匿名对象的方法 来简化开发
         *  直接在main函数中使用匿名对象来创建类
         */
        // 这里并不是直接定义接口对象，而是在
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫...");
            }
        };
        System.out.println("tiger 的运行类型 " + tiger.getClass());
        tiger.cry();
    }
}
interface IA{
    // 定义动物叫的方法
    public void cry();
}

