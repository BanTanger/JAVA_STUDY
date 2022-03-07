package com.bantanger.download_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class DownloadClient {
    public static void main(String[] args) throws Exception {
        // 接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("用户请输入要下载的文件名\n1.高山流水\n2.无名");
        String downloadFileName = scanner.next();

        // 客户端连接服务器，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 创建与Socket关联的输出流，不用Buffer，效率更高
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes()); // 写入要传入字节数组
        outputStream.flush();// 写入数据必须刷新
        socket.shutdownOutput();

        // 读取服务端返回的文件(字节数据）
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 得到输出流，将bytes写入到磁盘文件
        String filePath = "e:\\" + downloadFileName + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        bos.flush();

        // 关闭相关资源
        bos.close();
        bis.close();
        socket.close();
        outputStream.close();
        System.out.println("客户端退出");
    }
}
