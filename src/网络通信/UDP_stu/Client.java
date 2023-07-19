package 网络通信.UDP_stu;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket =new DatagramSocket();//创建客户端对象（发送端），可以不写端口由系统分配也可以自己写
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)创建数据包
        //buf：要发送的内容，字节数组
        //length：要发送内容的字节长度
        //address：接收端的IP地址对象
        //port：接收端的端口号
        byte[] bytes ="hello".getBytes();
        DatagramPacket packet =new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);
        socket.send(packet);
        socket.close();//关闭客户端

    }
}
