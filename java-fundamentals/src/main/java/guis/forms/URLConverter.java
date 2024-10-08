package guis.forms;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author maumneto
 */
public class URLConverter extends JFrame {
    JLabel TEXT;
    JTextField URL;
    JButton CONVERTER;

    public URLConverter(String title) {
        super(title);
        Container CONT = getContentPane();

        TEXT = new JLabel("Put the URL");
        URL = new JTextField();
        CONVERTER = new JButton("Convert");

        setLayout(null);

        CONT.add(TEXT);
        CONT.add(URL);
        CONT.add(CONVERTER);

        TEXT.setBounds(20, 20, 150, 30);
        URL.setBounds(20, 50, 200, 30);
        CONVERTER.setBounds(20, 80, 100, 30);

        Converter EVENT = new Converter();
        CONVERTER.addActionListener(EVENT);

        setSize(250, 200);
        setVisible(true);
    }

    private class Converter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String url = URL.getText();

            JFrame frame = new JFrame();
            JFrame.setDefaultLookAndFeelDecorated(true);
            JLabel IP = new JLabel(" ");
            JLabel ADDRESS = new JLabel(" ");

            frame.add(IP);
            frame.add(ADDRESS);

            frame.setLayout(null);

            IP.setBounds(20, 20, 200, 20);
            ADDRESS.setBounds(20, 50, 200, 20);

            frame.setSize(300, 200);
            frame.setVisible(true);

            try {
                InetAddress address = InetAddress.getByName(url);
                String ip = address.getHostAddress();
                String ad = address.getHostName();

                IP.setText("IP: " + ip);
                ADDRESS.setText("Address: " + ad);

            } catch (UnknownHostException exp) {
                JOptionPane.showMessageDialog(null, exp.toString(), "Error", 1);
            }

        }
    }


    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        URLConverter urlconverter = new URLConverter("URL Converter");
        urlconverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}