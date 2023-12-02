package 多线程_考试版.线程3种创建;

/**
 * 继承Thread要重写run
 * 要用线程实例.start()来启动
 */
class 子线程 extends Thread{
    private int order;

    子线程(int order) {
        this.order = order;
    }

    @Override
    public void run() {
        for(int i=1;i<10;i++)
        {
            System.out.println(order+",");
        }
    }
}

public class 扩展Thread类 {
    public static void main(String[] args) {
        子线程 t1=new 子线程(1);
        t1.start();
        子线程 t2 =new 子线程(2);
        t2.start();
    }
}
