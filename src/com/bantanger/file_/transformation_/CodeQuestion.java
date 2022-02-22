package com.bantanger.file_.transformation_;

import java.io.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/hello.txt";
        // InputStreamReader --> 将InputStream 字节流转成 Reader 字符流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String s = bufferedReader.readLine();
        System.out.println("读取：" + s);
        bufferedReader.close();
        // 程序默认使用utf-8，无法读取中文字符gdk格式，
        // 所以需要用到InputStreamReader转换流解决中文乱码

        /*int readLen = 0;
        byte[] bytes = new byte[8];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        while((readLen = bufferedInputStream.read(bytes)) != -1){
            System.out.print(new String(bytes,0,readLen));
        }
        bufferedInputStream.close();*/
    }
}
