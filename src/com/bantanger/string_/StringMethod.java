package com.bantanger.string_;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class StringMethod {
    public static void main(String[] args) {
        String name = "john";
        String name2 = "joHn";
        System.out.println(name.equals(name2)); // 区分大小写
        String username = "johN";
        if ("john".equalsIgnoreCase(username)){
            System.out.println("Success!");
        }else {
            System.out.println("Failure!");
        } // equalsIgnoreCase 字符串比较忽略大小写
        System.out.println("bantang半糖".length()); // 获取字符串长度

        // indexOf 获取字符在字符串对象中第一次出现的索引，索引从零开始，找不到就返回-1.
        String s1 = "wracac@bantanger";
        int index = s1.indexOf('@');
        System.out.println(index);

        // lastindexOf 获取字符在字符串对象中最后一次出现的索引，索引从零开始，找不到就返回-1.
        String s2 = "weracad@bant@anger@";
        int index2 = s2.lastIndexOf('@');
        System.out.println(index2);

        // substring(6) 从索引6开始截取后面的所有内容
        String name3 = "hello,张三";
        System.out.println(name3.substring(6));
        // substring(0,5)
        // 左闭右开 从索引 2 开始截取 ，截取到索引 5-1 = 4 的位置
        System.out.println(name3.substring(2,5));

    }
}
