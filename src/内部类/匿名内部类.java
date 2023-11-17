package 内部类;

public class 匿名内部类 {
    public static void main(String[] args) {
        Swimming cat =new Swimming() {
            @Override
            public void siwm() {
                System.out.println("猫游了10秒");
            }

        };//实例化接口

        go(cat);
        //或者直接
        go(new Swimming() {
            @Override
            public void siwm() {
                System.out.println("狗游了10秒");
            }
        });

    }
    //使用匿名类就不用多创建一步



   public static void go(Swimming s)
    {
        System.out.println("比赛开始");
        s.siwm();
    }

}
interface Swimming{  //游泳的能力，只有有这个能力才能参加游泳比赛
    void siwm();
}