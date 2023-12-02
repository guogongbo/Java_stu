package 多线程_考试版.线程3种创建;

/**
 * implements Runnable
 * new Thread(new 子类（）)
 *
 */
 class 子类 implements Runnable{

    private int order;

    子类(int order) {
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
public class 实现Runnable接口 {
    public static void main(String[] args) {
        Thread T1= new Thread(new 子类(1));
        T1.start();;
        Thread T3= new Thread(new 子类(3));
        T3.start();;
        Thread T2=new Thread(()->{for(int i=1;i<10;i++)
        {
            System.out.println(2+",");
        }});
        T2.start();
    }
}
