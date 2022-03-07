package com.bantanger.file_.Buffered_;

import java.io.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 *
 *
 * 1。BufferedReader 和 BufferedWriter 是安装字符操作
 * 2. 不要去操作 二进制文件【声音，视频，图片。doc，pdf】 ， 会造成文件损坏
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "D:\\NEWS.txt";
        String destFilePath = "D:\\NEWS2.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("拷贝完毕...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
