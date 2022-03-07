package com.bantanger.innerclass_;

public class AnonymousInnerClass02 {
    public static void main(String[] args) {
        // 直接调用 匿名内部类本省也是返回对象
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名对象重写 hi");
            }

            @Override
            public void ok(String name) {
                super.ok(name);
            }
        //}.hi();
        }.ok("jack");
    }
}
class Person{
    public void ok(String name){
        System.out.println("name " + name + " say ok");
    }
    public void hi(){
        System.out.println("Person hi()");
    }
}