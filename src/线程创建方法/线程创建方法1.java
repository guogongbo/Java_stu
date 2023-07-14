package 线程创建方法;

public class 线程创建方法1 extends Thread {
    Thread thread= Thread.currentThread();



    @Override
    public void run() {
        thread.setName("方法1");
        for (int i=0;i<5;i++)
        {
            System.out.println(thread.getName()+i);
        }
    }
}
