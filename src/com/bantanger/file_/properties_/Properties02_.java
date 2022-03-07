package com.bantanger.file_.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author bantanger 半糖
 * @version 1.0
 *
 * properties 读取文件
 *
 */
public class Properties02_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // 加载mysql.properties 文件 load
        properties.load(new FileReader("E:\\Java 学习" +
                "项目集合\\Java_Test_Try\\src\\mysql.properties"));

        // 将k-v显示到控制台
        properties.list(System.out);
        // 根据key 获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);
    }
}
