package examen_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClases = new JButton("CLASES");
		btnClases.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/clases64.png")));
		btnClases.setSelectedIcon(null);
		btnClases.setBounds(10, 23, 174, 79);
		contentPane.add(btnClases);
		
		JButton btnArchivos = new JButton("ARCHIVOS");
		btnArchivos.setSelectedIcon(null);
		btnArchivos.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/archivos64.png")));
		btnArchivos.setBounds(10, 114, 174, 79);
		contentPane.add(btnArchivos);
		
		JButton btnExcepciones = new JButton("EXCEPCIONES");
		btnExcepciones.setSelectedIcon(null);
		btnExcepciones.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/clases64.png")));
		btnExcepciones.setBounds(10, 204, 174, 79);
		contentPane.add(btnExcepciones);
		
		JButton btnPersona = new JButton("PERSONA");
		btnPersona.setSelectedIcon(null);
		btnPersona.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/votante64.png")));
		btnPersona.setBounds(219, 23, 174, 79);
		contentPane.add(btnPersona);
		
		JButton btnVotante = new JButton("VOTANTE");
		btnVotante.setSelectedIcon(null);
		btnVotante.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/jurado64.png")));
		btnVotante.setBounds(219, 114, 174, 79);
		contentPane.add(btnVotante);
		
		JButton btnJurado = new JButton("JURADO");
		btnJurado.setSelectedIcon(null);
		btnJurado.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/jurado264.png")));
		btnJurado.setBounds(219, 204, 174, 79);
		contentPane.add(btnJurado);
		
		JButton btnCandidato = new JButton("CANDIDATO");
		btnCandidato.setSelectedIcon(null);
		btnCandidato.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/candidato64.png")));
		btnCandidato.setBounds(219, 297, 174, 79);
		contentPane.add(btnCandidato);
		
		JButton btnVotar = new JButton("VOTAR");
		btnVotar.setSelectedIcon(null);
		btnVotar.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/icons8_ticket_64px.png")));
		btnVotar.setBounds(417, 23, 174, 79);
		contentPane.add(btnVotar);
		
		JButton btnConteo = new JButton("CONTEO");
		btnConteo.setSelectedIcon(null);
		btnConteo.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/conteo64.png")));
		btnConteo.setBounds(417, 114, 174, 79);
		contentPane.add(btnConteo);
		
		JButton btnGanador = new JButton("GANADOR");
		btnGanador.setSelectedIcon(null);
		btnGanador.setIcon(new ImageIcon(inicio.class.getResource("/imagenes/clases64.png")));
		btnGanador.setBounds(417, 204, 174, 79);
		contentPane.add(btnGanador);
	}
}
