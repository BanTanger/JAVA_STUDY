package com.bantanger.udp_.homeworkUseUDP;

import java.io.IOException;
import java.net.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class HomeA {
    public static void main(String[] args) throws IOException {
        // A 是接收端
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buf = new byte[2048];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("A 端接收数据");
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        String answer = "";
        if (s.equals("四大名著是那些")){
            answer = "四大名著是<< 红楼梦 >> ...";
        }else{
            answer = "what?";
        }

        byte[] bytes = answer.getBytes();
        packet = new DatagramPacket
                (bytes,bytes.length,InetAddress.getByName("192.168.0.102"), 8888);
        socket.send(packet);
        socket.close();
    }
}
