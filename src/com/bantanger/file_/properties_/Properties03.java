package com.bantanger.file_.properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author bantanger 半糖
 * @version 1.0
 *
 * properties 修改文件
 *
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // 创建数据
        properties.setProperty("charset","utf8");
        properties.setProperty("user","bantanger");
        properties.setProperty("pwd","888888");

        // 保存数据 k - v
        properties.store(new FileWriter("E:\\Java 学习" +
        "项目集合\\Java_Test_Try\\src\\mysql2.properties"),null);
        System.out.println("保存配置文件成功");
    }
}
