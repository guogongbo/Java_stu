package stu;
//如果一个学生A还是歌手和司机，但是如果把歌手和司机也写成类的话，A只能继承其中一个，但用接口就能完善A又是歌手还是学生；
public class 接口的好处 {
    public static void main(String[] args) {
        A a =new A();
        a.drive();
        a.study();
        a.sing();
    }
}
class A extends student implements singger,Driver
{
    @Override
    public void sing() {
        System.out.println("Jay的歌");
    }

    @Override
    public void drive() {
        System.out.println("有驾驶证");

    }
    //alt+shift+enter快速实现接口



}
class student
{
    void study(){
        System.out.println("100分");

    };
}
interface singger
{
    void sing();
}
interface Driver
{
    void drive();
}