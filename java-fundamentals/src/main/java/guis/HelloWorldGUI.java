package guis;

import javax.swing.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World from GUI");
        JLabel hello = new JLabel();
        frame.setLayout(null);
        hello.setText("Hello World From Label!");
        frame.getContentPane().add(hello);
        hello.setBounds(30, 20, 200, 30);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
