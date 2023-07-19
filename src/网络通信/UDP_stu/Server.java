package 网络通信.UDP_stu;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket server =new DatagramSocket(6666);
        //创建一个数据包来接受数据
        byte[] bytes = new byte[1024*3];//3kb
        DatagramPacket packet =new DatagramPacket(bytes,bytes.length);
        server.receive(packet);
        //这个时候数据包就会收到数据
        int len=packet.getLength();
        String str=new String(bytes,0,len);
        System.out.println(str);

    }
}
