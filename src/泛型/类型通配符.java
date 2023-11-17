package 泛型;

import java.util.ArrayList;
import java.util.List;

public class 类型通配符 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }

    public static void getData(List<?> data) {         //   ?不能用T代替，T要先声明，不然会报错找不到T
        System.out.println("data :" + data.get(0));
    }
}
