package GUI编程;

import javax.swing.*;

public class JDialogdemo {
    public static void main(String[] args) {
        JFrame JF =new JFrame("title");
        JF.setBounds(400,300,400,250);
        JF.setVisible(true);
        JF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //-------------------------JDialog
        JDialog jd =new JDialog(JF,"JDiaolg");//JDialog要依附于JFrame
        jd.setBounds(400,300,400,250);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
