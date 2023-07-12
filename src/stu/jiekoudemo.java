package stu;

public class jiekoudemo {
    //接口的关键字interface,只有常量和抽象方法,下面的jiekouming后面不能加（）不然报错
    //接口也不能创建对象，即jiekouming A=new jiekouming（）；会报错。因为是接口嘛，不是类。
    public interface jiekouming {
        String name ="aaaa";//默认为常量
        void f1();//不能加{}因为是抽象方法不能有函数体；

    }
}
