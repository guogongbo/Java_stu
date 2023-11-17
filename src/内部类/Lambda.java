package 内部类;

public class Lambda {
    @FunctionalInterface          //函数式接口，只能有一个抽象方法
    interface FunctionInterface{
        void show();
    }
    //内部类是new 对象（）{}
    //lambda是（）->{}
}
