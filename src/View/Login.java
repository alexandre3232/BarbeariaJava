package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.LoginController;
import Model.DAO.Banco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	private final LoginController controller;

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldSenha;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		Banco.inicia();
		controller = new LoginController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 911);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
				controller.entraNoSistema();
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEntrar.setBounds(324, 513, 118, 23);
		contentPane.add(btnEntrar);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(324, 468, 118, 20);
		contentPane.add(passwordFieldSenha);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(324, 406, 118, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Elephant", Font.BOLD, 35));
		lblNewLabel_2.setBounds(324, 266, 108, 52);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Elephant", Font.BOLD, 15));
		lblNewLabel_3.setBounds(324, 369, 63, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Elephant", Font.BOLD, 15));
		lblNewLabel_4.setBounds(324, 437, 63, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagem/painel-login.png")));
		lblNewLabel_1.setBounds(99, 200, 558, 381);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagem/Logo.jpg")));
		lblNewLabel.setBounds(0, 0, 757, 781);
		contentPane.add(lblNewLabel);
	}

	public void exibeMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

	public void setTextFieldUsuario(JTextField textFieldUsuario) {
		this.textFieldUsuario = textFieldUsuario;
	}

	public JPasswordField getPasswordFieldSenha() {
		return passwordFieldSenha;
	}

	public void setPasswordFieldSenha(JPasswordField passwordFieldSenha) {
		this.passwordFieldSenha = passwordFieldSenha;
	}	
}
