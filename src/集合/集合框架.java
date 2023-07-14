package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

//框架分两种collection，map。区别就是map存键值对，两个数据
//collection由分为list接口，set接口，区别set不允许有重复的Set 接口实例存储的是无序的，没有索引
//list和set接口的实现类有很多，重点arraylist，linklist
public class 集合框架 {
    public static void main(String[] args) {
        Collection <String> strings =new ArrayList<>();
       // ArrayList <String> strings1 =new ArrayList<>();//这两种都可以，我们用第一种
        strings.add("1");
        strings.add("2");
        strings.add("3");
        System.out.println(strings);
        //使用迭代器iterator遍历输出
        //语法iterator<E> 迭代器对象名=strings（集合对象名）.interger（）；
        //迭代器常用方法两种hasnext（）表示当前位置是否有元素，next（）获取当前元素并将迭代器对象指向下一个；
        Iterator<String> integer = strings.iterator();
        while (integer.hasNext())
        {
            System.out.println(integer.next());
        }
        //增强for（数据类型 变量名 : 所在集合或数组）注意这里的变量名随便写相当于一般for循环的i
        for (String i :strings)
        {
            System.out.println(i);
        }
        //Lambda表达式也能遍历，集合对象名.foreach（new consummer<>(){"这是接口的匿名内部类"}）
        strings.forEach(new Consumer<String>() {//形参可以用lambda表达式
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        strings.forEach(s ->System.out.println(s));//Lambda表达式对于有且只有一个方法的接口 ，
    }                                            //（方法的形参，可以不用写数据类型）->{方法函数体，如果方法函数体只有一行，那么可以不写大括号}
}
