package 枚举;

public class main {
    public static void main(String[] args) {
        Test test =Test.GREEN;
        System.out.println(test);
        Test[] tests =Test.values();
        //遍历枚举
        for (Test i :tests)
        {
            System.out.println(i);
        }
        System.out.println(test.ordinal());
        //Test test1 =new Test();这行代码错误，枚举类不能对外new
    }
}
