package com.bantanger.api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        // 1.获得本地的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost(); // BanTanger/192.168.0.102
        // host = 主机名 / ipv4地址
        System.out.println(localHost);

        // 2.根据指定主机名 获取 InetAddress 对象
        InetAddress banTanger = InetAddress.getByName("BanTanger");
        System.out.println("host = " + banTanger); // BanTanger/192.168.0.102
        // 这里有个疑问，主机名应该是存在同名情况，那怎么样去区分各种的ip地址呢，
        // 还是说在一个固定地区所有的ipv4地址都是一样的？
        // 通过网卡的mac确定唯一性

        // 3.根据域名返回 InetAddress对象（ip地址和主机名（域名）一起返回），比如 www.baidu.com
        InetAddress host = InetAddress.getByName("www.baidu.com");
        System.out.println("host = " + host);

        // 4.通过 InetAddress 对象，获取到对应的ip地址
        String hostAddress = host.getHostAddress();
        System.out.println("host 对应的ip地址 = " + hostAddress);

        // 5.通过 InetAddress 对象，获得相应的主机名/域名
        String hostName = host.getHostName();
        System.out.println("host 对应的主机名/域名 = " + hostName);
    }
}
