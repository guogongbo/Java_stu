package 线程安全.取钱案例;

public class 取钱线程 extends Thread {
    private Account acc;

    public 取钱线程(Account a ,String name) {
        super(name);
        this.acc=a;
    }

    @Override
    public void run() {
        acc.quqian(10000);
    }
}
