package 泛型容器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collectionsdemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        for (int i=2;i<=6;i++){
            arrayList.add("String"+i);
        }
        arrayList.add("String"+1);
        //-------sort排序
        Collections.sort(arrayList);
        //Collections.sort(arrayList, Comparator.reverseOrder());
        String str= "String"+5;
        System.out.println(Collections.binarySearch(arrayList,str,(a,b)->a.compareTo(b)));
        arrayList.forEach(o-> System.out.println(o));
    }


}
