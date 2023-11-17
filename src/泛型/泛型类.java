package 泛型;

public class 泛型类 {
    public class Box<T> {

        private T t;

        public void add(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }


    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new 泛型类().new Box<Integer>();
        Box<String> stringBox =  new 泛型类().new Box<String>();   //访问内部类，要创建外部类实例后在创建内部类实例

        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}
