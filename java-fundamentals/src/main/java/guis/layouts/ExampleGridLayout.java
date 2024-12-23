package guis.layouts;

import javax.swing.*;
import java.awt.*;

public class ExampleGridLayout {
    public static void main(String[] args) {
        // elementos de alto nível
        JFrame frame = new JFrame("Grid Layout Example");
        JPanel panel = new JPanel();

        // definir o layout do container como GridLayout (3 linhas, 2 colunas)
        panel.setLayout(new GridLayout(3, 2));

        // componentes do container
        JLabel lblName = new JLabel("Nome: ");
        JTextField txtName = new JTextField(20);
        JLabel lblAge = new JLabel("Idade: ");
        JTextField txtAge = new JTextField(20);
        JButton btnMessage = new JButton("Clique Aqui");
        JLabel lblOutput = new JLabel();

        // adicionar componentes ao container
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblAge);
        panel.add(txtAge);
        panel.add(btnMessage);
        panel.add(lblOutput);

        // adicionar o container à tela
        frame.getContentPane().add(panel);

        // ação do botão
        btnMessage.addActionListener(e -> {
            if (Double.parseDouble(txtAge.getText()) >= 18) {
                lblOutput.setText(txtName.getText() + ", você é maior de idade");
            } else {
                lblOutput.setText(txtName.getText() + ", você é menor de idade");
            }
        });

        // configurações da tela
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}