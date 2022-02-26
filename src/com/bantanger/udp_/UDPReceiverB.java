package com.bantanger.udp_;

import java.io.IOException;
import java.net.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class UDPReceiverB {
    public static void main(String[] args) throws IOException {
        // B 为发送端 在8888端口进行接收数据 意思是端口号无需一致，只要在传输时写清主机和端口号就行
        DatagramSocket socket = new DatagramSocket(8888);

        // B 端发送数据
        // 封装发送数据到DatagramPacket对象
        byte[] data = "hello,world".getBytes();

        DatagramPacket packet = new DatagramPacket
                (data, data.length, InetAddress.getByName("192.168.0.102"), 9999);

        socket.send(packet);

        // 接收 A 端数据
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        // 接收
        socket.receive(packet);// 如果没有接收到数据，进程阻塞在receive方法
        // 拆包
        int length = packet.getLength(); // 得到当前传输数据的长度，不一定有1024那么长
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        // 关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
