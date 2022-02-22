package com.bantanger.file_.fileIO_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    // 方式一
    public void create01(){
        String filePath = "E:\\Java 学习项目集合" +
                "\\Java_Test_Try\\src\\com\\bantanger/file_/news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    // 方式二 new File(File parent,String child) // 根据父目录文件 + 子路径构建
    // 左斜杠二次，右斜杠一次
    public void create02(){
        File parentFile = new File("E:\\Java 学习项目集合" +
                "\\Java_Test_Try\\src\\com\\bantanger");
        String name = "file_/bibi.java";
        File file = new File(parentFile,name);

        try {
            file.createNewFile(); // 这一步将操作写入磁盘
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    // 方式三 new File(String parent , String child) // 根据父目录 + 子路径构建
    public void create03(){
        String parentPath = "e:/";
        String filePath = "news";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
