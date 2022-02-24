package com.bantanger.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端 (ip,端口)
        // 连接本机的 9999 端口，如果连接成功就返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 Client 返回 socket = " + socket.getClass());
        // 2. 连接上后 ， 生成Socket 通过 socket.getOutputStream() ，得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        // 3. 通过输出流，写入数据到 数据通道
        outputStream.write("hello, server".getBytes());

        // 设置结束标记
        socket.shutdownOutput();

        // test: 接收Server端的数据 为什么不会读取呢，也不报错 --> 需要设置结束标记
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println("接收到服务端的数据为:" + new String(buf,0,readLen));
        }
        // 4. 关闭流对象和socket ，避免资源浪费
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
