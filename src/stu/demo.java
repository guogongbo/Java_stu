package stu;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Hello worl");
       // packetdemo d1 =new packetdemo();
       // d1.print();
        ArrayList<String> strings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextByte())
        {
            String str =scanner.next();
            if(str!= "a")
            {
                strings.add(str);
            }
        }
        arrylisttest at =new arrylisttest();
        System.out.println(at.find(strings));
    }
    public int f1()
    {
        return 1;
    }
}

