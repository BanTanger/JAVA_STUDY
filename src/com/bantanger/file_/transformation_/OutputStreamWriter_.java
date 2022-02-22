package com.bantanger.file_.transformation_;

import java.io.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:/hello.txt";
        String charSet = "gbk";
        OutputStreamWriter outputStreamWriter = new
                OutputStreamWriter(new FileOutputStream(filePath), charSet);
        outputStreamWriter.write("hi,半糖");
        outputStreamWriter.close();
    }
}
