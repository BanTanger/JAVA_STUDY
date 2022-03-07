package com.bantanger.homework.homework01;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class Frock {
    private static int currentNum = 100000; // 初始序列号
    private int serialNumber;
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;// 生成序列号
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }
}
