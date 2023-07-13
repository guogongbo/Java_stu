package 内部类;
//内部类就是定义在类中的类，可以看成是一种方法，可以访问整个类的变量
//内部类一共4种，成员，静态，局部（定义在类的方法里面的类，没啥用），匿名（重点）
public class 内部类TEST {
    public static void main(String[] args) {
        内部类.Inner inner= new 内部类().new Inner();//注意新建内部类的成员内部类对象要使用两个new
        内部类.static_class sc =new 内部类.static_class();//静态内部类只需一个new
        Animal a =new Animal()
        {

            @Override
            public void cry() {
                System.out.println("喵喵");
            }
        };



    }
}
abstract class Animal        //抽象类
{
    public abstract  void cry();
}
//一般情况如果向创建抽象类的子类就要在冲写重，如下
class cat extends Animal{

    @Override
    public void cry() {
        System.out.println("喵喵");
    }
}//但是可以直接使用匿名内部类，第8行