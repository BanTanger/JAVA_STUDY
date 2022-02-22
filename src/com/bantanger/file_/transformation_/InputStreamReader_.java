package com.bantanger.file_.transformation_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:/hello.txt";

        // 把 FileInputStream 转换成 InputStreamReader
        // 指定编码gbk
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }
}
