package guis.forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstForm extends JFrame {

    JPanel pnlMain = new JPanel();
    JLabel lblName = new JLabel("Nome: ");
    JTextField tfName = new JTextField(20);
    JButton btnOk = new JButton("Enviar");
    JLabel output = new JLabel();
    JRadioButton btnMasculino = new JRadioButton("Masculino", true);
    JRadioButton btnFeminino = new JRadioButton("Feminino");
    ButtonGroup radioGroup = new ButtonGroup();

    FirstForm() {
        super("Meu Primeiro Formulário");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlMain.setLayout(new FlowLayout());
        pnlMain.add(lblName);
        pnlMain.add(tfName);
        pnlMain.add(btnOk);
        pnlMain.add(btnMasculino);
        pnlMain.add(btnFeminino);
        pnlMain.add(output);

        radioGroup.add(btnMasculino);
        radioGroup.add(btnFeminino);

        this.add(pnlMain);

        btnOk.addActionListener(new MyEvent());
    }

    private class MyEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = tfName.getText();
            if (btnMasculino.isSelected()) {
                output.setText("Bem vindo, Sr. " + name);
            } else {
                output.setText("Bem vinda, Srta. " + name);
            }
            tfName.setText("");
            tfName.requestFocus();
        }
    }


    public static void main(String[] args) {
        FirstForm myform = new FirstForm();
    }
}
