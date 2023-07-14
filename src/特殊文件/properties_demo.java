package 特殊文件;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

//properties 是一个map集合，用来代表属性文件，可以读取属性文件的内容
public class properties_demo {
    public static void main(String[] args) throws Exception {
        //创建properties对象
        Properties properties =new Properties();
        System.out.println(properties);//没加载之前，是空集合，一样它是map集合嘛
        //加载属性文件给properties
        properties.load(new FileReader("E:\\shixi\\Java_stu\\src\\特殊文件\\属性文件.properties"));
        System.out.println(properties);
        //根据键取值
        System.out.println(properties.getProperty("a"));
        //遍历全部键和值
        Set<String> key =properties.stringPropertyNames();//返回键
        for (String i:key)
        {
            System.out.println(i);
            System.out.println(properties.getProperty(i));
        }
    }

}
