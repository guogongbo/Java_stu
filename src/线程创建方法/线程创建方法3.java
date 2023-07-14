package 线程创建方法;

import java.util.concurrent.Callable;

////前面两种run方法无返回值
////第三种利用callable接口，futuretask类来实现
public class 线程创建方法3 implements Callable<String> {
    private int n;

    public 线程创建方法3(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int num = 0;
        for (int i=0;i<n;i++)
        {
            num+=i;
        }
        return "和为"+num;
    }
    //1，创建任务对象，定义一个类实现callable接口注意是泛型<E>，重写call方法，封装要做的事和要返回的数据
    //把callable类型的对象封装成线程任务对象futuretask
    //2.把线程任务对象交给thread对象
    //用start（）
    //线程执行完后用futuretask对象的get方法获取结果
}
