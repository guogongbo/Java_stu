package GUI编程;

import javax.swing.*;
import java.awt.*;

public class JPaneldemo {
    public static void main(String[] args) {
        JFrame jf =new JFrame("JFrame");
        jf.setBounds(400,300,400,250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //-------------按钮JButton
        JButton okbuntton =new JButton("ok");
        JButton cancelbuntton =new JButton("cancel");
        //----------------JPanel是面板，用来装组件，然后在被装入JFrame
        JPanel jp =new JPanel();
        jp.setLayout(new FlowLayout());
        jp.add(okbuntton);
        jp.add(cancelbuntton);

        jf.add(jp);

    }
}
