package 异常;

public class 自定义异常 extends RuntimeException{
    //自己写异常先构造，alt+insert
    public 自定义异常() {
    }

    public 自定义异常(String message) {
        super(message);
    }

}
