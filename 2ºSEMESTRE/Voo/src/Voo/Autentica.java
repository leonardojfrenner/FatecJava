package Voo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Autentica {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autentica window = new Autentica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Autentica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(68, 54, 422, 326);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAutenticacao = new JLabel("AUTENTICAÇÃO");
		lblAutenticacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutenticacao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAutenticacao.setBounds(38, 60, 295, 52);
		panel.add(lblAutenticacao);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 11));
		lblLogin.setBounds(69, 139, 73, 14);
		panel.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 11));
		lblSenha.setBounds(69, 180, 46, 14);
		panel.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(152, 136, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 177, 130, 20);
		panel.add(passwordField);
		
		JButton btnEntrarAutentica = new JButton("Entrar");
		btnEntrarAutentica.setFont(new Font("Arial", Font.BOLD, 11));
		btnEntrarAutentica.setBounds(152, 223, 89, 23);
		panel.add(btnEntrarAutentica);
	}
}
