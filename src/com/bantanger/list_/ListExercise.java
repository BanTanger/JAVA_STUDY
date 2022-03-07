package com.bantanger.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
            // System.out.println(list);
        }
        // 第二号插入韩顺平教育
        list.add(1,"韩顺平教育");
        // 获得第五个元素
        Object o = list.get(6);
        // System.out.println(o);
        // 删除第六号元素
        list.remove(7);
        // 修改第七号元素
        list.set(7,"可怜人");
        // 使用增强for循环遍历
        for (Object o1 : list) {
            System.out.println(o1);
        }

    }
}
