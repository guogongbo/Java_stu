package 线程创建方法;

public class 线程创建方法2 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("方法2");

        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
