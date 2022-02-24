package com.bantanger.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        // 在本机 9999 端口监听，等待连接
        // 要求本机没有其他服务在监听 9999 端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");
        // 没有客户端连接9999端口时 程序阻塞，等待连接
        // 有客户端连接 返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("测试是否正常连接...");
        System.out.println("服务端 Server 返回 socket = " + socket.getClass());
        // 3. 通过 读取客户端写入数据到 数据通道
        InputStream inputStream = socket.getInputStream();
        // 4. IO读取 使用字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        System.out.println(s);

        // test: 客户端有没有可能接收server端的数据呢
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,Client 字符流");
        bw.newLine();
        bw.flush();

        // 5. 关闭流 和 socket
        br.close();
        bw.close();
        socket.close();
        serverSocket.close();
    }
}
