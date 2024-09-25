package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleJOptionsPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercicio JOptionsPane");
        JPanel pnlName = new JPanel();
        JPanel pnlOutput = new JPanel();

        JLabel lblName = new JLabel("Nome: ");
        JLabel lblResponse = new JLabel();
        JTextField tfName = new JTextField(20);
        JButton btnSend = new JButton("Enviar");

        pnlName.setLayout(new FlowLayout());
        pnlName.add(lblName);
        pnlName.add(tfName);

        pnlOutput.setLayout(new GridLayout(2,1));
        pnlOutput.add(btnSend);
        pnlOutput.add(lblResponse);

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                if (name.isEmpty()) {
                    name = JOptionPane.showInputDialog(null, "Escreva seu nome: ", "Nome não identificado", 1);
                    tfName.setText(name);
                } else {
                    JOptionPane.showMessageDialog(null, "Bem vindo" + name, "Boas Vindas", 1);
                }
                lblResponse.setText("Bem vindo Sr(a)." + name);
            }
        });


        frame.setLayout(new BorderLayout());
        frame.add(pnlName, BorderLayout.NORTH);
        frame.add(pnlOutput, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
