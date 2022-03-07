package com.bantanger.chapter14_homework.Homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);

        // 将jack工资改成2600元
        hashMap.put("jack",2600);

        // 为所有员工的工资增加100元
        // 使用keySet拿到所有key
        Set keyset = hashMap.keySet();
        for (Object key : keyset) {
//            hashMap.get(key) 得到的是key对应的value，因为返回是Objeck，所以需要向下转型
            hashMap.put(key,(Integer) hashMap.get(key) + 100);
        }

        // 使用EntrySet遍历
        Set entrySet = hashMap.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" +  entry.getValue());
        }
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

