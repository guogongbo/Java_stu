package stu;

import java.util.ArrayList;
//在demo里面调用该类的方法find，说明class就是一个独立的主体
public class arrylisttest {
    public ArrayList<String> find(ArrayList<String> strings)
    {
        for (int i=0;i<strings.size();i++)
        {
            String temp =strings.get(i);
            if (temp=="A")
            {
                strings.remove(temp);
            }
        }
        return strings;


    }


}
