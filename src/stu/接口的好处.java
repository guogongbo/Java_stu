package stu;
//如果一个学生A还是歌手和司机，但是如果把歌手和司机也写成类的话，A只能继承其中一个，但用接口就能完善A又是歌手还是学生；
//接口可以换不同的实现类，比如driver可以开跑车也可以开卡车；、
//对于同一个需求提供不同方案就等于对一个接口提供不同实现类
public class 接口的好处 {
    public static void main(String[] args) {
        A a =new A();
        a.drive();
        a.study();
        a.sing();
        Driver b =new A();
        b.drive();
       //直接改变接口的实现类就可以改变实现方法 Driver b =new B();

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
        System.out.println("开跑车");

    }
    //alt+shift+enter快速实现接口



}
class B implements Driver
{

    @Override
    public void drive() {
        System.out.println("开卡车");
    }
}
class student
{
    void study(){
        System.out.println("100分");

    }
}
interface singger
{
    void sing();
}
interface Driver
{
    void drive();
}