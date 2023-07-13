package 内部类;

public class 内部类 {
    public class Inner {
        public Inner() {                    //成员内部类，相当于普通方法
        }

        private String name;
        public Inner(String name) {
            this.name = name;
        }
    }
    static class static_class{             //静态内部类相当于静态函数
        private String name;

        public static_class() {
        }

        public static_class(String name) {
            this.name = name;
        }
    }


}
