package com.bantanger.download_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class DownloadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端等待连接...");
        Socket socket = serverSocket.accept();

        /*BufferedReader br = new BufferedReader
                (new InputStreamReader(socket.getInputStream()));
        br.readLine();*/
        // 读取客户端想要下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        String downloadFileName = "";
        while((readLen = inputStream.read(buf)) != -1){
            downloadFileName += new String(buf,0,readLen);
        }
        System.out.println("客户端下载的文件名是 = " + downloadFileName);

        // 读取本地是否有客户端要求的文件
        String resFileName = "";
        if ("高山流水".equals(downloadFileName)){
            resFileName = "src\\高山流水.mp3";
        }else{
            resFileName = "src\\无名.mp3";
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));

        // 使用工具类StreamUtils，读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 获得一个Socket输出流，空流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 写入到数据通道，返回给客户端
        bos.write(bytes);
        socket.shutdownOutput();

        // 关闭资源
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
