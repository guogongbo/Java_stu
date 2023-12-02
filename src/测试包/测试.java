package 测试包;

public class 测试 {
    public static void main(String[] args) {
        int r=5;
        float area= (float) (r*r*3.14);
        String s=new String("a,b,c");
        System.out.println(s.length());

    }
    public static int test(){
        int a = 1;
        try{
            a = 2/0;
            return a;
        }catch(Exception e){
            a = 3;
            return a;
        }finally{
            a = 4;
            System. out. print("+nowcoder");
            return a;
        }
    }
    //测试

}
