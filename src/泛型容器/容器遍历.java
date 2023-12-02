package 泛型容器;

import java.util.ArrayList;
import java.util.Iterator;

public class 容器遍历 {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("no.1");
        arrayList.add("no.2");
        arrayList.add("no.3");
        arrayList.add("no.4");

        //----------------增强型for
        for(String a :arrayList)
        {
            System.out.println(a);
        }
        //----------foreach
        arrayList.forEach(o-> System.out.println(o));


        ////Iterator
        Iterator<String> iterator = arrayList.iterator();//这里注意是arrayList.iterator()，不用new
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
