package Voo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JPanel;

public class Visual {

	private JFrame frame;
	private JTextField RespNumeroVoo;
	private JTextField RespCdOrigem;
	private JTextField RespCdDestino;
	private JTextField RespAssento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visual window = new Visual();
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
	public Visual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.windowBorder);
		frame.setBounds(100, 100, 461, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumeroVoo = new JLabel("Número do Voo:");
		lblNumeroVoo.setFont(new Font("Arial", Font.BOLD, 11));
		lblNumeroVoo.setBounds(86, 124, 124, 40);
		frame.getContentPane().add(lblNumeroVoo);
		
		JLabel lblOrigem = new JLabel("Cidade de origem:");
		lblOrigem.setFont(new Font("Arial", Font.BOLD, 11));
		lblOrigem.setBounds(86, 164, 124, 14);
		frame.getContentPane().add(lblOrigem);
		
		JLabel lblDestino = new JLabel("Cidade de destino:");
		lblDestino.setFont(new Font("Arial", Font.BOLD, 11));
		lblDestino.setBounds(86, 189, 124, 14);
		frame.getContentPane().add(lblDestino);
		
		JLabel lblquantidadeAssentosReservados = new JLabel("Assentos necessários:");
		lblquantidadeAssentosReservados.setFont(new Font("Arial", Font.BOLD, 11));
		lblquantidadeAssentosReservados.setBounds(86, 208, 145, 32);
		frame.getContentPane().add(lblquantidadeAssentosReservados);
		
		RespNumeroVoo = new JTextField();
		RespNumeroVoo.setBounds(241, 134, 86, 20);
		frame.getContentPane().add(RespNumeroVoo);
		RespNumeroVoo.setColumns(10);
		
		RespCdOrigem = new JTextField();
		RespCdOrigem.setBounds(241, 161, 86, 20);
		frame.getContentPane().add(RespCdOrigem);
		RespCdOrigem.setColumns(10);
		
		RespCdDestino = new JTextField();
		RespCdDestino.setBounds(241, 186, 86, 20);
		frame.getContentPane().add(RespCdDestino);
		RespCdDestino.setColumns(10);
		
		RespAssento = new JTextField();
		RespAssento.setBounds(241, 214, 86, 20);
		frame.getContentPane().add(RespAssento);
		RespAssento.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBackground(SystemColor.menu);
		panel.setBounds(32, 60, 354, 256);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPassagem = new JLabel("Passagem Aérea");
		lblPassagem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassagem.setBounds(113, 31, 152, 23);
		panel.add(lblPassagem);
		
		JButton btnEnviarReserva = new JButton("Enviar");
		btnEnviarReserva.setBounds(82, 204, 89, 23);
		panel.add(btnEnviarReserva);
		btnEnviarReserva.setFont(new Font("Arial", Font.BOLD, 11));
		
		JButton btnLimparReservar = new JButton("Limpar");
		btnLimparReservar.setFont(new Font("Arial", Font.BOLD, 11));
		btnLimparReservar.setBounds(211, 204, 89, 23);
		panel.add(btnLimparReservar);
	}
}
