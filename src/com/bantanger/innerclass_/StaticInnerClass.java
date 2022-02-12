package com.bantanger.innerclass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        /*Outer10 outer10 = new Outer10();
        outer10.m1();*/
        System.out.println();
        Outer10.Inner10.say();
    }
}

class Outer10 { //外部类
    private int n1 = 10;
    private static String name = "张三";
    private static void cry() {}
    //Inner10就是静态内部类
    //1. 放在外部类的成员位置
    //2. 使用static 修饰
    //3. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    //4. 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    //5. 作用域 ：同其他的成员，为整个类体
    static class Inner10 {
        private static String name = "韩顺平教育";
        public static void say() {
            //如果外部类和静态内部类的成员重名时，静态内部类访问的时，
            //默认遵循就近原则，如果想访问外部类的成员，则可以使用 （外部类名.成员）
            System.out.println(name + " 外部类name= " + Outer10.name);
            cry();
        }
    }

    public void m1() { //外部类---访问------>静态内部类 访问方式：创建对象，再访问
        /*Inner10 inner10 = new Inner10();
        inner10.say();*/
        Inner10.say();
    }

}