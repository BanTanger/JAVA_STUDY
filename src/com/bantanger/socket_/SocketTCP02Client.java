package com.bantanger.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        // 连接服务端 (ip,端口)
        // 连接本机的 9999 端口，如果连接成功就返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 Client 返回 socket = " + socket.getClass());
        // 2. 连接上后 ， 生成Socket 通过 socket.getOutputStream() ，得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        // 3. 通过输出流，写入数据到 数据通道
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,server 字符流输入");
        bw.newLine(); // 插入换行符，代表写入内容结束，对方必须使用readLine（）！！！
        bw.flush(); // 如果使用字符流需要手动刷新flush，否则数据不会写入数据通道

        // 注意，使用字符流不需要 设置结束标记
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        System.out.println(s);

        // 4. 关闭流对象和socket ，避免资源浪费
        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
