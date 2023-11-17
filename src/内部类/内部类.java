package 内部类;

public class 内部类 {
    int a=0;
    int d=0;
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

    public void methodA()            //局部内部类，定义在方法内
    {
        int b=0;
        final int d =10;
        class Inner{     //内部类相当于局部变量，不能使用访问权限符和static
            int a2=a;
            int b2=b;
            int d2=d;//d=10
            int d3= 内部类.this.d;//要访问外部同名变量外部内名.this.变量名


        }
        Inner inner=new Inner();
        System.out.println(inner.a2+inner.d2+inner.d3);

    }



}
