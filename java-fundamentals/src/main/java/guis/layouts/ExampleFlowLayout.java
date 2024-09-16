package guis.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleFlowLayout {
    public static void main(String[] args) {
        // elementos de alto nível
        JFrame frame = new JFrame("Flow Layout Example");
        JPanel panel = new JPanel();

        // componentes do container
        JLabel lblName = new JLabel("Nome: ");
        JTextField txtName = new JTextField(20);
        JLabel lblAge = new JLabel("Idade: ");
        JTextField txtAge = new JTextField(20);
        JButton btnMessage = new JButton("Clique Aqui");
        JLabel lblOutput = new JLabel();

        // layout do container (FlowLayout)
        panel.setLayout(new FlowLayout());
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblAge);
        panel.add(txtAge);
        panel.add(btnMessage);
        panel.add(lblOutput);
        frame.getContentPane().add(panel);

        // acão do botão
        btnMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Double.parseDouble(txtAge.getText()) >= 18) {
                    lblOutput.setText(txtName.getText() + ", você é maior de idade");
                } else {
                    lblOutput.setText(txtName.getText() + ", você é menor de idade");
                }
            }
        });

        // configurações da tela
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
