package stu;



    interface 接口新增3个方法{
        void f0();//普通方法
        //方法一前面写default默认方法/即实现类可以直接使用默认方法不需要定义，能直接调用
        default void f1()
        {
            System.out.println("默认方法");

        }
        //方法2private私有方法，实现类不能访问，但能通过默认方法和其他私有方法调用,要jdk9才能用，这个好像是JKD8
       /* private void f2()
    {

    }

*/
        //方法3static静态方法，就比如驾驶员接口统一多了一个可以领驾驶员补贴的静态方法，就不用再去向每个实现类重定义方法了
        static void f3()
        {
            System.out.println("静态方法");
        }
    }

