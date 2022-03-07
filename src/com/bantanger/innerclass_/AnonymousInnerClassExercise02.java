package com.bantanger.innerclass_;

public class AnonymousInnerClassExercise02 {
    public static void main(String[] args) {
        // main函数中 直接往f1函数传入匿名对象 装逼简洁高效
        f1(new IB() {
            @Override
            public void show() {
                System.out.println("展示我的风采");
            }
        });
    }
    // 静态方法 形参是接口类型
    public static void f1(IB ib){
        ib.show();
    }
}
interface IB{
    public void show();
}
