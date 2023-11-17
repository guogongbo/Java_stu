package 对象封装;

public class Student {
    private double score;

    public void Setscore(double score)//属性score为private，外界无法访                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        问，只能通过Setscore来赋值无法更改值；？
    {
        this.score= score;
    }
    public void Show()
    {
        System.out.println(score>=60?"Pass":"Unpass");
    }
}

