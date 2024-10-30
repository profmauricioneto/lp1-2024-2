package guis.review;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestaoInterface extends JFrame {
    JLabel lblInput = new JLabel("entre com um texto: ");
    JLabel lblOutput = new JLabel("");
    JTextArea taInput = new JTextArea(10, 10);
    JButton btnCalcular = new JButton("Contar Caracteres");

    public QuestaoInterface() {
        super("Contador de Caracteres");

        this.setLayout(new FlowLayout());
        add(lblInput);
        add(taInput);
        add(btnCalcular);
        add(lblOutput);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String phrase = taInput.getText().trim();
                lblOutput.setText("Quantidade de Caracteres: " + phrase.length());
            }
        });

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        QuestaoInterface q = new QuestaoInterface();
    }
}
