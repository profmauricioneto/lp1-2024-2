package guis.layouts;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

public class ExampleBorderLayout {
    public static void main(String[] args) {
        // elementos de alto nível
        JFrame screen = new JFrame("Border Layout Example 01");
        JPanel panel = new JPanel();

        // componentes do container
        JLabel lblName = new JLabel("Nome: ");
        JTextField txtName = new JTextField();
        JLabel lblOutput = new JLabel();

        // tamanhos preferenciais dos componentes no container
        lblName.setPreferredSize(new Dimension(300, 50));
        txtName.setPreferredSize(new Dimension(300, 150));
        lblOutput.setPreferredSize(new Dimension(300, 100));

        // layout do container (BorderLayout)
        panel.setLayout(new BorderLayout());
        panel.add(lblName, BorderLayout.NORTH);
        panel.add(txtName, BorderLayout.CENTER);
        panel.add(lblOutput, BorderLayout.SOUTH);

        // ações dos componentes
        txtName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblOutput.setText("Olá Sr. " + txtName.getText());
            }
        });

//        txtName.getDocument().addDocumentListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                updateLabel();
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {
//                updateLabel();
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {
//                updateLabel();
//            }
//
//            private void updateLabel() {
//                lblOutput.setText("Olá Sr. " + txtName.getText());
//            }
//        });

        // adicionando o container na tela
        screen.getContentPane().add(panel);
        screen.setSize(300, 300);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
