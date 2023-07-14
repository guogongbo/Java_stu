package 线程创建方法;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class 多线程概述 {
    public static void main(String[] args) throws Exception{
        //线程创建方法1：继承Thread类
        Thread thread =new 线程创建方法1();
        thread.start();//要用start（）才能让线程跑起来；要写在主线程任务之前
        ////线程创建方法2：使用runnable接口,但分两步第一步创建Runnable任务对象，第二步用thread跑这个任务
        Runnable runnable =new 线程创建方法2();//第一步
        Thread thread1 =new Thread(runnable);
        thread1.start();
        //线程创建方法2的runnable接口可以使用匿名内部类，即将文件线程创建方法2就可以省略
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("方法2的第2种写法");
                for (int i=0;i<5;i++)
                {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }).start();
        //13行还能改成
        // Thread thread1 =new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                for (int i=0;i<5;i++)
        //                {
        //                    System.out.println("线程2的第二种"+i);
        //                }
        //            }
        //        })；
        // thread2.start();
        //还能用lambda方式将13行简化
        //new Thread(()-> {
        //                for (int i=0;i<5;i++)
        //                {
        //                    System.out.println("线程2的第二种"+i);
        //                }
        //            }
        //        }).start();
        //
        //第三种方法
        Callable<String> callable=new 线程创建方法3(100);//多态的方式
        //使用接口重写call（）方法，交给线程任务对象futuretask
        FutureTask<String> task3=new FutureTask<>(callable);
        //再将futuretask对象交给thread，思想：只有thread才能创建进程,只有start才能运行进程
        new Thread(task3).start();//
        System.out.println(task3.get());//用futuretask对象的get方法或许线程返回值

        //主线程

        for (int i=0;i<5;i++)
        {
            System.out.println("主线程"+i);
        }


    }
}
