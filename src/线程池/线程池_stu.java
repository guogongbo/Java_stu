package 线程池;

import java.util.concurrent.*;
//把线程放进线程池会自动执行
public class 线程池_stu {
    //线程池
    //ExecutorService的实现类是 ThreadPoolExecutor
    //下面是ThreadPoolExecutor构造器
//public ThreadPoolExecutor(int corePoolSize,
//                          int maximumPoolSize,
//                          long keepAliveTime,
//                          TimeUnit unit,
//                          BlockingQueue<Runnable> workQueue,
//                          RejectedExecutionHandler handler)
    //corePoolSize（必需）：核心线程数。默认情况下，核心线程会一直存活，但是当将 allowCoreThreadTimeout 设置为 true 时，核心线程也会超时回收。
    //maximumPoolSize（必需）：线程池所能容纳的最大线程数。当活跃线程数达到该数值后，后续的新任务将会阻塞。
    //keepAliveTime（必需）：线程闲置超时时长。如果超过该时长，非核心线程就会被回收。如果将 allowCoreThreadTimeout 设置为 true 时，核心线程也会超时回收。
    //unit（必需）：指定 keepAliveTime 参数的时间单位。常用的有：TimeUnit.MILLISECONDS（毫秒）、TimeUnit.SECONDS（秒）、TimeUnit.MINUTES（分）。
    //workQueue（必需）：任务队列。通过线程池的 execute() 方法提交的 Runnable 对象将存储在该参数中。其采用阻塞队列实现。
    //threadFactory（可选）：线程工厂。用于指定为线程池创建新线程的方式。
    //handler（可选）：拒绝策略。当达到最大线程数时需要执行的饱和策略。
//下面来创建线程池
    public static void main(String[] args) {
        ExecutorService pool =new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );
        //RejectedExecutionHandler handler对于新任务拒绝策略有几种方法
        //1.ThreadPoolExecutor.AbortPolicy()本次用的是丢弃任务并抛出异常
       //2. ThreadPoolExecutor.DiscardOldestPolicy()抛出队列中等待最久的任务，把当前任务加入
        //3.ThreadPoolExecutor.CallerRunsPolicy()将这个任务由主线程调用，而不用线程池调用
        //现在创建线程对象，用第2种runnable，交给线程池，用execute() 方法自动执行
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行"+Thread.currentThread());
            }
        });
        pool.execute(thread);//将线程放进线程池，会自动运行
        pool.execute(thread);

        pool.shutdown();//关闭线程池
    }
}
