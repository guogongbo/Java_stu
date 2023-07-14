package 线程安全.锁;
//资源一般用一个类，就像取钱案例中的Account一样
public class colck {
    //synchronized ()//括号里面如果是引号如果“A”，“B”,系统中只能有一个，就如卡1取钱的是卡2就不能取钱
                    //括号里面填this就代表这一个对象，就像卡1ATM取钱就不能微信上取钱
   // {
        //可能进程出差的代码块

   // }
    //静态方法用类名.class作为锁
    public static void test()
    {
        synchronized (colck.class)
        {
         System.out.println("静态方法");
        }

    }


}
