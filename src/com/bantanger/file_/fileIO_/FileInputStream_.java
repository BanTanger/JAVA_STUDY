package com.bantanger.file_.fileIO_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void create() throws IOException {
        String filePath = "e:/hello.txt";
        byte[] bytes = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        File file = new File(filePath);
        try {
            file.createNewFile();
            fileInputStream = new FileInputStream(filePath);
            while((readLen = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readLen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            file.delete(); // 删除文件
            fileInputStream.close(); // 关闭流对象
        }
    }
}
