package 泛型容器;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet要实现Comparable接口，能够执行compareTo方法
 * 例子第55行 TreeSet<String> treeSet1 =new TreeSet<>((a,b)-> -a.compareTo(b));0为相等，负数为a小于b从小到大排
 *
 * 集合里不能放重复对象，不能放基本数据类型，只能放引用数据类型（对象）。
 * Set有两个具体实现类：无序的HashSet、有序的TreeSet。
 */
class Point implements Comparable {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "<" + x + "," + y + ">";
    }
    public int compareTo(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point)obj;
            return (x * 1000 + y) - (p.x * 1000 + p.y);
        } else {
            return -1;
        }
    }
}
public class SetDemo {



    public static void main(String[] args) {
        Set<Point> s = new TreeSet<>();
        s.add(new Point(2, 1)); // 向集合中加入元素
        s.add(new Point(1, 1));
        s.add(new Point(2, 2));
        s.add(new Point(1, 2));
// 遍历方式1：迭代器
        Iterator<Point> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
// 遍历方式2：使用增强for循环（推荐）
        for (Point sett : s) {
            System.out.println(sett.toString());
        }
        HashSet<String> hashSet =new HashSet<>() ;
        TreeSet<String> treeSet =new TreeSet<>();
        TreeSet<String> treeSet1 =new TreeSet<>((a,b)-> a.compareTo(b));
        for (int i=1;i<=5;i++){
            treeSet.add("String"+i);
            treeSet1.add("String"+i);
            hashSet.add("String"+i);
        }
        System.out.println(treeSet1);
        System.out.println(treeSet);
        System.out.println(hashSet);
        //----用迭代器
        Iterator<String> iterator= treeSet1.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
