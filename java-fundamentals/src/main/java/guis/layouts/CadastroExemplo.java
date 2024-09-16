package guis.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroExemplo {

    public static void gravarCadastro(String nickname, String email, String senha) {
        // implementar a gravacao do cadastro.
    }


    public static void main(String[] args) {
        // criando elementos de alto nível
        JFrame frame = new JFrame("Cadastro de Usuários");
        JPanel pnlNickname = new JPanel();
        JPanel pnlEmail = new JPanel();
        JPanel pnlSenha = new JPanel();
        JPanel pnlBotao = new JPanel();

        // componentes do container
        JLabel lblNickname = new JLabel("Nickname: ");
        JLabel lblEmail = new JLabel("Email: ");
        JLabel lblSenha = new JLabel("Senha: ");
        JLabel lblOutput = new JLabel();
        JTextField txtNickname = new JTextField(20);
        JTextField txtEmail = new JTextField(20);
        JPasswordField txtSenha = new JPasswordField(20);
        JButton btnCadastrar = new JButton("Cadastrar");

        pnlNickname.setLayout(new GridLayout(1,2));
        pnlNickname.add(lblNickname);
        pnlNickname.add(txtNickname);

        pnlEmail.setLayout(new GridLayout(1,2));
        pnlEmail.add(lblEmail);
        pnlEmail.add(txtEmail);

        pnlSenha.setLayout(new GridLayout(1,2));
        pnlSenha.add(lblSenha);
        pnlSenha.add(txtSenha);

        pnlBotao.setLayout(new GridLayout(2,1));
        pnlBotao.add(btnCadastrar);
        pnlBotao.add(lblOutput);

        frame.setLayout(new FlowLayout());
        frame.add(pnlNickname);
        frame.add(pnlEmail);
        frame.add(pnlSenha);
        frame.add(pnlBotao);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // capture os dados do cadastro e salve em arquivo!
                lblOutput.setText("Cadastro Realizado!");
            }
        });

        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
