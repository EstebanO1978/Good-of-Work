package proyectYane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PantallaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2689104134494632683L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
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
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWorkOfGood = new JLabel("Work of Good Menu");
		lblWorkOfGood.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 17));
		lblWorkOfGood.setBounds(62, 11, 173, 40);
		contentPane.add(lblWorkOfGood);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(29, 81, 136, 23);
		contentPane.add(btnAgregar);
		
		JButton btnListrar = new JButton("Listrar");
		btnListrar.setBounds(239, 81, 89, 23);
		contentPane.add(btnListrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(239, 115, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(29, 115, 136, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(29, 149, 136, 23);
		contentPane.add(btnBorrar);
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(239, 150, 136, 23);
		contentPane.add(btnConfiguracion);
		 btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			agregarD agre= new	agregarD();
				agre.setVisible(true);;
			}
			});

	}
	}
