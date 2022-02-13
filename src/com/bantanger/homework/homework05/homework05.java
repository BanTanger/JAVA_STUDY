package com.bantanger.homework.homework05;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class homework05 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.show();
    }
}
class A {
    private String name = "妞子";
    public class B {
        private final String name = " 张三 ";
        public void show (){
            System.out.println("B 的名字:"+ name + "A 的名字:" + A.this.name);
        }
    }
}
