package com.bantanger.wrapper;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        int n = 100;
        // jdk5 之前的手动装箱
//        Integer integer = new Integer(n);
//        Integer integer1 = Integer.valueOf(n);
        // 自动装箱 n -> Integer
        Integer integer = n;// 底层是Integer.valueOf(n);
        // 自动拆箱 Integer -> n2
        int n2 = integer;// 底层使用 IntValue()方法
        String name = "jack";
        String name2 = "tom";
        name = name2;
    }
}
