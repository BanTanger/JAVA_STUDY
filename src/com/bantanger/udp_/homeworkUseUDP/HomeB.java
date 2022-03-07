package com.bantanger.udp_.homeworkUseUDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class HomeB {
    public static void main(String[] args) throws IOException {
        // B 为发送端
        DatagramSocket socket = new DatagramSocket(8888);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1或2");

        String s = scanner.next();
        byte[] buf = null;
        switch (s){
            case "1":
                buf = "四大名著是那些".getBytes();
                break;
            case "2":
                buf = "1111".getBytes();
                break;
        }

        DatagramPacket packet = new DatagramPacket
                (buf, buf.length, InetAddress.getByName("192.168.0.102"), 9999);
        socket.send(packet);

        byte[] bytes = new byte[1048];

        packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();
        String str = new String(data, 0, length);
        System.out.println(str);

        socket.close();
        System.out.println("发送端 B 退出");
    }
}
