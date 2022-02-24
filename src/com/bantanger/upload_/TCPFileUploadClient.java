package com.bantanger.upload_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

      /*  String str = "192.168.0.107";
        String[] ipStr = str.split("\\.");
        byte[] ipBuf = new byte[4];
        for (int i = 0; i < 4; i++) {
            ipBuf[i] = (byte) (Integer.parseInt(ipStr[i])&0xff);
        }*/
        // 客户端连接服务端8888端口，得到socket对象
        Socket socket = new Socket(/*InetAddress.getByAddress(ipBuf)*/InetAddress.getLocalHost(), 8888);
        // 使用输入流（可以读取二进制文件）
        String filePath = "e:/bantanger.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        // bytes 就是 file 的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();

        // 接收服务端的消息
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
        br.close();

        bos.close();
        socket.close();
    }
}
