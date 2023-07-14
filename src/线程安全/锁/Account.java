package 线程安全.锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private int card_id;
    private double money;
    //创建一个锁,因为LOCK是一个接口，所以要用它的实例化ReentrantLock()创建对象；
    private Lock lk=new ReentrantLock();//创建lk后有两个操作lock和unlock

    public Account(int card_id, double money) {
        this.card_id = card_id;
        this.money = money;
    }

    public int getCard_id() {
        return card_id;
    }

    public double getMoney() {
        return money;
    }

    public void quqian(double m)
    {
        Thread thread=Thread.currentThread();
//下面这样做是为了防止if里面如果报错就会抛出异常不会归还lock，导致后面的进程都不会执行，所以一定要归还锁即再finally里面写unlock
        try {
            lk.lock();
            if (m<=this.money)
            {
                this.money-=m;
                System.out.println(thread.getName()+"取钱"+m);
            }
            else {
                System.out.println(thread.getName()+"余额不足");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }

    }


}
