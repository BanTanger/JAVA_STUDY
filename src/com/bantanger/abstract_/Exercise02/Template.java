package com.bantanger.abstract_.Exercise02;

abstract public class Template {
    // 抽象方法job
    public abstract void job();
    // 计算时间的方法
    public void calculate(){
        long start = System.currentTimeMillis();
        job(); // 动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("执行时间 " + (end - start));
    }
}
