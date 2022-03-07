package com.bantanger.file_.fileIO_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {

    }

    @Test
    public void create() {
        String srcFilePath = "E:/bantanger.jpg";
        String destFilePath = "E:/bantanger2.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            int readLen = 0;
            byte[] bytes = new byte[2048];
            while ((readLen = fileInputStream.read()) != -1) {
                fileOutputStream.write(bytes, 0, readLen);
//                fileOutputStream.write(bytes);
            }
            System.out.println("Copy successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
