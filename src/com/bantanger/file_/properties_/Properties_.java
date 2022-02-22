package com.bantanger.file_.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Properties_ {
    public static void main(String[] args) throws IOException {
        // 传统读取mysql.properties 文件，得到ip，user，pwd
        BufferedReader br = new BufferedReader(
                new FileReader("E:\\Java 学习项目集合\\Java_Test_Try\\src\\mysql.properties"));
        String line = "";
        /*while((line = br.readLine()) != null){
            System.out.println(line);
        }*/

        // 进行拆分，得到数据
        while ((line = br.readLine()) != null) {
            String[] split = line.split("=");
            // System.out.println(split[0] + "值是:" + split[1]);

            // 若要求固定数据 例如 只要ip , 这里“ip” 字符串需要严格对应，哪怕多了个等号也无法得到响应
            if ("ip".equals(split[0])) {
                System.out.println(split[0] + " 值是: " + split[1]);
            }
        }

        br.close();
    }
}
