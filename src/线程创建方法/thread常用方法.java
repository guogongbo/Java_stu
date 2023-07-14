package 线程创建方法;

public class thread常用方法 {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();//谁执行这条程序，就会被标记，这里是main执行，所以main线程被标记
        System.out.println(t.getName());//所以t的名字就是main
        t.setName("取名线程");//还能自己设名字
        System.out.println(t.getName());
    }
}
