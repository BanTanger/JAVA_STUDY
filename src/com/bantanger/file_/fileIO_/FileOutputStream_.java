package com.bantanger.file_.fileIO_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
         String filePath = "e:/a.txt";
         int readLen = 0;
        byte[] bytes = new byte[8];
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            // 1.new FileOutputStream(filePath); 覆盖方式
            // 2.new FileOutputStream(filePath，true); 追加 append
            fileOutputStream = new FileOutputStream(filePath);
            // 写入字符串
            String str = "陈松a,民";
            // 第一种写法
//            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            // 第二种写法
            fileOutputStream.write(bytes,0,str.length());
            fileInputStream = new FileInputStream(filePath);
            while((readLen = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
