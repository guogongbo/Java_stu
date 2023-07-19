package 网络通信;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inetaddress_stu {
    //InetAddress 类的方法
    //这个类表示互联网协议(IP)地址。\
    public static void main(String[] args) throws Exception {
        InetAddress ip1 =InetAddress.getLocalHost();//返回本地主机。
        System.out.println(ip1.getHostName());// 获取此 IP 地址的主机名
        System.out.println(ip1.getHostAddress());//getHostAddress() 返回 IP 地址字符串（以文本表现形式）。
        InetAddress ip2 =InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.isReachable(6000));//6秒内能否联通


    }

}
