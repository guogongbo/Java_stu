package 线程安全.取钱案例;

public class Account {
    private int card_id;
    private double money;

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
        synchronized (this) {
            if (m<=this.money)
            {
                this.money-=m;
                System.out.println(thread.getName()+"取钱"+m);
            }
            else {
                System.out.println(thread.getName()+"余额不足");
            }
        }
    }


}
