package com.bantanger.file_.homework_.homework01;

import java.io.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 * <p>
 * 要求：
 * 1. 判断e盘是否有文件夹mytemp，如果没有就创建mytemp
 * 2. 在e:\\mytemp目录下，创建文件hello.txt
 * 3. 如果hello。txt 已经存在，提示该文件已经存在，不再重复创建
 * 4. 并且在hello。txt文件中，写入hello，world~
 */
public class homework01 {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\mytemp";
        File file = new File(filePath);
        if (!file.exists()) {
            if (file.mkdir()) {
                // File.mkdir 返回boolean，创建多级目录使用mkdirs，单级使用mkdir
                System.out.println("创建 " + filePath + " 成功");
            } else {
                System.out.println("创建失败");
            }
        }
        File filetxt = new File(filePath, "hello.txt");
        if (!filetxt.exists()) {
            if (filetxt.createNewFile()) {
                // File.createNewFile 返回boolean 创建文件
                System.out.println("创建 " + filetxt + "成功");
                // 如果文件已存在，使用BufferedWriter 字符输入流写入内容

               /* BufferedWriter bw = new BufferedWriter(new FileWriter(filetxt));
                bw.write("hello,world~ 你你你");
                System.out.println("写入内容成功");
                bw.close();*/

                // 或者使用转换流，避免字符编码错误
                OutputStreamWriter osw = new OutputStreamWriter
                        (new FileOutputStream(filetxt));
                osw.write("hello,world 程佳佳");
                System.out.println("写入内容成功");
                osw.close();
            } else {
                System.out.println("创建失败");
            }
        }else{
            System.out.println("文件已经存在");
        }
    }
}
