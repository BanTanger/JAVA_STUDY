package com.bantanger.socket_.homeworkUseTCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class HomeClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedWriter bw = new BufferedWriter
                (new OutputStreamWriter(socket.getOutputStream()));
        bw.write("name");
        bw.newLine();
        bw.flush();
        /*System.out.println("输出1,2,3其中一个");
        Scanner scanner = new Scanner(System.in);
        String key = scanner + "";
        switch (key){
            case "1":

                break;
            case "2":
                bw.write("hobby");
                break;
            case "3":
                bw.write("yiyiyi");
                break;
        }
*/
        // 结束标记
        socket.shutdownOutput();

        // 接收服务端的数据
        BufferedReader br = new BufferedReader
                (new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        bw.close();
        br.close();
        socket.close();
    }
}
