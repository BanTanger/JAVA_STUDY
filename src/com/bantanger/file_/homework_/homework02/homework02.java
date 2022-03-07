package com.bantanger.file_.homework_.homework02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bantanger 半糖
 * @version 1.0
 * <p>
 * 使用BufferedReader读取一个文本文件，为每行加上行号
 * 若把文件编码改成gbk，出现中文乱码
 * 使用转换流，将FileInputStream -> InputStreamReader
 */
public class homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\NEWS.txt";
        String readLen = " ";
        int i = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        while ((readLen = bufferedReader.readLine()) != null){
            System.out.println((++i) + " " + readLen);
        }
        bufferedReader.close();
    }
}
