package com.bantanger.treeset_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        // 无参默认按照字典序来排序
//        TreeSet treeSet = new TreeSet();
        // 设置comparator构造器，比较字符串长度
        // 通过匿名内部类的方式来实现
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        treeSet.add("jack");
        treeSet.add("mike");
        treeSet.add("tom");
        treeSet.add("king");
        System.out.println(treeSet);
    }
}
