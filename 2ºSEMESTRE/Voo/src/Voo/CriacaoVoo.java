package Voo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CriacaoVoo {

	private JFrame frame;
	private JTextField respCrieNumVoo;
	private JTextField respCrieCdOrigem;
	private JTextField respCrieCdDestino;
	private JTextField respCrieAssentos;
	private JTextField respCrieValorVoo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriacaoVoo window = new CriacaoVoo();
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
	public CriacaoVoo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(41, 11, 318, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCrieNumVoo = new JLabel("Número do Voo:");
		lblCrieNumVoo.setFont(new Font("Arial", Font.BOLD, 11));
		lblCrieNumVoo.setBounds(10, 67, 141, 14);
		panel.add(lblCrieNumVoo);
		
		JLabel lblCrieCdOrigem = new JLabel("Cidade de origem: ");
		lblCrieCdOrigem.setFont(new Font("Arial", Font.BOLD, 11));
		lblCrieCdOrigem.setBounds(10, 92, 141, 14);
		panel.add(lblCrieCdOrigem);
		
		JLabel lblCrieCdDestino = new JLabel("Cidade de destino:");
		lblCrieCdDestino.setFont(new Font("Arial", Font.BOLD, 11));
		lblCrieCdDestino.setBounds(10, 117, 122, 14);
		panel.add(lblCrieCdDestino);
		
		JLabel lblCrieAssentos = new JLabel("Assentos Disponíveis:");
		lblCrieAssentos.setFont(new Font("Arial", Font.BOLD, 11));
		lblCrieAssentos.setBounds(10, 142, 141, 14);
		panel.add(lblCrieAssentos);
		
		JLabel lblAtencao = new JLabel("ATENÇÃO");
		lblAtencao.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblAtencao.setForeground(new Color(255, 0, 0));
		lblAtencao.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtencao.setBounds(58, 11, 199, 30);
		panel.add(lblAtencao);
		
		respCrieNumVoo = new JTextField();
		respCrieNumVoo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		respCrieNumVoo.setBounds(142, 64, 86, 20);
		panel.add(respCrieNumVoo);
		respCrieNumVoo.setColumns(10);
		
		respCrieCdOrigem = new JTextField();
		respCrieCdOrigem.setBounds(142, 92, 86, 20);
		panel.add(respCrieCdOrigem);
		respCrieCdOrigem.setColumns(10);
		
		respCrieCdDestino = new JTextField();
		respCrieCdDestino.setBounds(142, 117, 86, 20);
		panel.add(respCrieCdDestino);
		respCrieCdDestino.setColumns(10);
		
		respCrieAssentos = new JTextField();
		respCrieAssentos.setBounds(142, 139, 86, 20);
		panel.add(respCrieAssentos);
		respCrieAssentos.setColumns(10);
		
		JButton btnCrie = new JButton("Confirmar");
		btnCrie.setBounds(139, 205, 89, 23);
		panel.add(btnCrie);
		
		JLabel lblcCrieValorVoo = new JLabel("Valor R$:");
		lblcCrieValorVoo.setFont(new Font("Arial", Font.BOLD, 11));
		lblcCrieValorVoo.setBounds(10, 170, 122, 14);
		panel.add(lblcCrieValorVoo);
		
		respCrieValorVoo = new JTextField();
		respCrieValorVoo.setBounds(142, 167, 86, 20);
		panel.add(respCrieValorVoo);
		respCrieValorVoo.setColumns(10);
	}

}
