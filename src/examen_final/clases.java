package examen_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class clases extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clases frame = new clases();
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
	public clases() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("En esta ventana debe colocar un label y como imagen colocar el diagrama de clases del proyecto con las relaciones correctas");
		lblNewLabel.setBounds(10, 11, 523, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lbDiagrama = new JLabel("Diagrama de clases");
		lbDiagrama.setBounds(10, 62, 692, 425);
		contentPane.add(lbDiagrama);
	}
}
