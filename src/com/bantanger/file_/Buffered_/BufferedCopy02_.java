package com.bantanger.file_.Buffered_;

import java.io.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 *
 *
 * 1. 使用BufferedInputStream 和 BufferedOutputStream
 * 2. 可以拷贝二进制拷贝 【声音，视频，图片，doc，pdf】 也可以读取文本文件 txt，java
 */
public class BufferedCopy02_ {
    public static void main(String[] args) {
        String srcFilePath = "C:\\Users\\12902\\Desktop\\bantanger - 副本.jpg";
        String destFilePath = "C:\\Users\\12902\\Desktop\\bantanger2 - 副本.jpg";
        int readLen = 0;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[] bytes = new byte[1024];
            while((readLen = bis.read(bytes)) != -1){
                bos.write(bytes,0,readLen);
            }
            System.out.println("文件拷贝完毕...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null){
                    bis.close();
                }
                if (bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
