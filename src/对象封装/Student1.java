package 对象封装;

public class Student1 {
   public double score;//属性为public不安全

    public void Setscore(double score)
    {
        this.score= score;
    }
    public void Show()
    {
        System.out.println(score>=60?"Pass":"Unpass");
    }
}

