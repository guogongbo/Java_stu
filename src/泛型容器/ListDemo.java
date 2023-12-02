package 泛型容器;

import java.util.ArrayList;

/**
 * List里可以放重复的对象。这是与set不一样的
 * List有两个具体实现类：
 * 1. ArrayList：底层用数组实现，查询效率高
 * 2. LinkedList：底层用双链表实现，插入与删除效率高
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        for (int i=1;i<=5;i++){
        arrayList.add("String"+i);
        }
        arrayList.add("String"+2);
        System.out.println(arrayList);
        arrayList.forEach(o-> System.out.println(o));
    }


}

