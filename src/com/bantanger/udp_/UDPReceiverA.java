package com.bantanger.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        // A 为接收端

        // 接收 B 端数据
        // 创建DatagramSocket 对象，端口为9999
        DatagramSocket socket = new DatagramSocket(9999);
        // 创建DatagramPacket 对象，传输数据，构建byte数组
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        // 接收
        System.out.println("接收端A 等待接收数据");
        socket.receive(packet);// 如果没有接收到数据，进程阻塞在receive方法
        // 拆包
        int length = packet.getLength(); // 得到当前传输数据的长度，不一定有1024那么长
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        // A 端发送数据
        data = "好的，明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.0.102"),8888);
        socket.send(packet);

        // 关闭资源
        socket.close();
        System.out.println("A端退出");
    }
}
