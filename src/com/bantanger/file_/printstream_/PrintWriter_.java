package com.bantanger.file_.printstream_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bantanger 半糖
 * @version 1.0
 *
 *  PrintWrite 字符打印流的使用
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(
                new FileWriter("D:/一一一.txt"));
        printWriter.print("被禁的敌方");
        printWriter.close();
    }
}
