package 异常;

import java.util.Scanner;

public class 异常处理 {
    public static void main(String[] args) {
        //就是把

        while (true) {

            try {
                f();
                break;
            } catch (Exception e) {
                System.out.println("输入非法");//与test中不一样，这行不再抛出异常，因为写抛出异常的话就会抛给调用main的jvm，然后程序停止
            }
        }

    }
    public static void f()

    {
        Scanner scanner =new Scanner(System.in);
        while (true) {
            if (scanner.nextInt()==1)
            {
                System.out.println("没有错误");
                return;
            }
            else
            {
                throw new 自定义异常("重新输入");
            }
        }

    }

}
