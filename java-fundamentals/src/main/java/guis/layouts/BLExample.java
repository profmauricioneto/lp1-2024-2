package guis.layouts;

import javax.swing.*;
import java.awt.*;

public class BLExample {
    public static void main(String[] args) {
        JFrame screen = new JFrame("Border Layout");
        JPanel panel = new JPanel();
        JButton btnNorth = new JButton("Norte");
        JButton btnSouth = new JButton("Sul");
        JButton btnEast = new JButton("Leste");
        JButton btnWest = new JButton("Oeste");
        JButton btnCenter = new JButton("Centro");

        panel.setLayout(new BorderLayout());
        panel.add(btnNorth, BorderLayout.NORTH);
        panel.add(btnSouth, BorderLayout.SOUTH);
        panel.add(btnEast, BorderLayout.EAST);
        panel.add(btnWest, BorderLayout.WEST);
        panel.add(btnCenter, BorderLayout.CENTER);

        screen.getContentPane().add(panel);
        screen.setSize(400, 400);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
