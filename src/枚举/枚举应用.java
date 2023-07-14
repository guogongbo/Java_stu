package 枚举;

public class 枚举应用 {
    public static void main(String[] args) {
        check(constant.BOY);
        check(constant.GIRL);//这样函数的参数就只能写枚举里面的对象了

    }
    public static void check(constant x)
    {
        switch (x){
            case BOY:
                System.out.println(1);
                break;
            case GIRL:
                System.out.println(2);
                break;
        }
    }

}
