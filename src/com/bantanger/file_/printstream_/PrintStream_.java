package com.bantanger.file_.printstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        // 在显示器上·输出
        PrintStream out = System.out;
        out.print("hello,world");
        // 或者是 使用write 因为print底层用的是write
        out.write("你好，半糖".getBytes());
        out.close();

        // 修改路径位置 让其创建文件，并且将数据存入文件中
        System.setOut(new PrintStream("d:\\123456.txt"));
        // 也无中文乱码现象，很牛
        System.out.println("你好半糖，休闲时间结束了");
    }
}
