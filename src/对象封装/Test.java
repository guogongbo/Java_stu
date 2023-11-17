package 对象封装;

public class Test {
    public static void main(String[] args) {
        //对于未封装的Student1，可以直接给其score赋值，不安全
        Student student =new Student();
        student.Setscore(98.2);
        student.Show();
        Student1 student1 =new Student1();
        student1.score=54;
        student1.Show();
    }
}
