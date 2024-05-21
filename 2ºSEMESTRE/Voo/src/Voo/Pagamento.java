package Voo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Pagamento {

	private JFrame frame;
	private JTextField respVooSelecionado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagamento window = new Pagamento();
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
	public Pagamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 485, 319);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPagamento = new JLabel("PAGAMENTO");
		lblPagamento.setBounds(188, 33, 90, 14);
		panel.add(lblPagamento);
		
		JLabel lblpgVooEscolhido = new JLabel("Voo Selecionado: ");
		lblpgVooEscolhido.setFont(new Font("Arial", Font.BOLD, 11));
		lblpgVooEscolhido.setBounds(102, 98, 137, 14);
		panel.add(lblpgVooEscolhido);
		
		respVooSelecionado = new JTextField();
		respVooSelecionado.setBounds(223, 95, 86, 20);
		panel.add(respVooSelecionado);
		respVooSelecionado.setColumns(10);
		
		JLabel lblpgPassagem = new JLabel("Passagem:");
		lblpgPassagem.setFont(new Font("Arial", Font.BOLD, 11));
		lblpgPassagem.setBounds(102, 123, 99, 14);
		panel.add(lblpgPassagem);
		
		JRadioButton rdbtnIda = new JRadioButton("ida");
		rdbtnIda.setBounds(223, 119, 74, 23);
		panel.add(rdbtnIda);
		
		JRadioButton rdbtnIdaVolta = new JRadioButton("ida e volta");
		rdbtnIdaVolta.setBounds(299, 119, 109, 23);
		panel.add(rdbtnIdaVolta);
		
		JLabel lblNewLabel = new JLabel("Pontos turísticos:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel.setBounds(102, 148, 99, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnPontosTuristicos = new JRadioButton("Sim");
		rdbtnPontosTuristicos.setBounds(223, 144, 109, 23);
		panel.add(rdbtnPontosTuristicos);
	}
}
