package examen_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class personas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personas frame = new personas();
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
	public personas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEnEstaVentana = new JTextArea();
		txtrEnEstaVentana.setText("Indicaciones\r\nEn esta ventana debe generar una ventana para poder \r\nguardar los datos de una persona en un \r\narchivo independiente.\r\nEjemplo:\r\nPersona 1: \r\nJuan Perez\r\n59784562 lp\r\n70548965\r\n25");
		txtrEnEstaVentana.setBounds(10, 11, 421, 195);
		contentPane.add(txtrEnEstaVentana);
	}

}
