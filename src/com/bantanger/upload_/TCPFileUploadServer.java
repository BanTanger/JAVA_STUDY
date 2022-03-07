package com.bantanger.upload_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        // 服务单本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 将得到的数组写入到一个指定的路径，就可以得到一个文件
        String destFilePath = "src\\bantanger.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        // 向客户端回复"收到图片"
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
//        bw.newLine(); // 表示不再输入 newLine()是readLine方法读取才能识别标记符？不太理解
        bw.flush(); // 必须刷新
        socket.shutdownOutput();
        bw.close();

        //关闭其他资源
        bis.close();
        serverSocket.close();
        socket.close();
    }
}
