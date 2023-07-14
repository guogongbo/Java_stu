package 线程安全.取钱案例;

public class 主程序 {
    public static void main(String[] args) {
        //创建账户
        Account account  =new Account(1001,10000);
        //创建进程
        new 取钱线程(account,"B").start();
        new 取钱线程(account,"A").start();



    }
}
