package GUI编程;

import javax.swing.*;

public class 事件监听器 {
    //   .addActionListener(new ActionListener(){
    //   public void actionPerformed(ActionEvent e) {}
    //   })
    //可以用lambda
    //.addActionListener(
    //       e->{}
    //      )
    //
    public static void main(String[] args) {
        //lambda表示关闭按钮
        JButton close =new JButton("close");
        close.addActionListener(E->System.exit(0));
// 完整的
// closeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0); // 结束程序
//            }
//        });
//
//sortButton = new JButton("排序");
//        sortButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String input = inputField.getText();
//                String[] numbers = input.split("\\s+"); // 假设输入的数据是空格分隔的数字
//                int[] intNumbers = new int[numbers.length];
//                for (int i = 0; i < numbers.length; i++) {
//                    intNumbers[i] = Integer.parseInt(numbers[i]);
//                }
//                Arrays.sort(intNumbers); // 对数字数组进行排序
//                String sortedInput = "";
//                for (int i = 0; i < intNumbers.length; i++) {
//                    sortedInput += intNumbers[i] + " "; // 将排序后的数字用空格连接成字符串
//                }
//                outputArea.setText(sortedInput); // 在不可编辑的文本框中显示排序后的结果
//            }
//        });
    }
}
