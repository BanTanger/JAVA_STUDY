package com.bantanger.socket_.homeworkUseTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class HomeServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端等待信息...");
        Socket socket = serverSocket.accept();
        // 接收消息，要使用字符流的
        byte[] buf = new byte[1024];
        BufferedReader br = new BufferedReader
                (new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        // 发送消息
        BufferedWriter bw = new BufferedWriter
                (new OutputStreamWriter(socket.getOutputStream()));
        if (s.equals("name")){
            bw.write("我是nova");
            bw.flush();
        }else if (s.equals("bobby")){
            bw.write("编写java程序");
            bw.flush();

        }else{
            bw.write("你说啥呢");
            bw.flush();

        }

        br.close();
        bw.close();
        socket.close();
        serverSocket.close();
    }
}
