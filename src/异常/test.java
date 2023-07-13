package 异常;
//收到异常会抛给jvm，jvm就会停止程序，抛出异常
//throws抛出异常给调用这个可能错误的方法的程序 new throws 异常名
//try catch捕获异常，就是用try{可能出错的方法}catch{异常名（可以是自己定义的异常） 新对象}

//自定义异常分两种，运行异常和编译异常，要分别继承两个异常父类RuntimeException,Exception
public class test {
    public static void main(String[] args) {

        try {
            f(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            f(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void f(int i)
    {
        if (i==1)
        {
            System.out.println("没有错误");
        }
        else
        {
            throw  new 自定义异常 ("出现某错误");//格式为throw new 异常名 （错误信息)
        }

    }

}
