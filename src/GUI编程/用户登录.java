package GUI编程;

import javax.swing.*;
import java.awt.*;

public class 用户登录 {
    public static void main(String[] args) {
        JFrame jf =new JFrame("用户登录");
        jf.setBounds(400,300,600,250);


        JPanel jp1 =new JPanel();
        JPanel jp2 =new JPanel();

        JLabel name=new JLabel("name");
        JLabel password =new JLabel("password");
        JTextField jt =new JTextField(20);//------JTextField文本域要长度
        JPasswordField jpass =new JPasswordField(20);


        JButton okbutton=new JButton("ok");
        JButton cancelbutton =new JButton("cancel");



        jp1.add(name);jp1.add(jt);jp1.add(password);jp1.add(jpass);
        jp2.add(okbutton);jp2.add(cancelbutton);


        jf.add(jp1,BorderLayout.CENTER);
        jf.add(jp2,BorderLayout.SOUTH);
        // jf.setLayout(new FlowLayout()); 流式布局和上面两个不能同时使用



        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
