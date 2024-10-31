package guis.layouts;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExampleBoxLayout {
    public static void main(String[] args) {
        // elementos de alto nível
        JFrame frame = new JFrame("Box Layout Example");
        JPanel panel = new JPanel();

        // definir o layout do container como BoxLayout (eixo Y)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

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
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}