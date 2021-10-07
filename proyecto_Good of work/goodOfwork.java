package proyectYane;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.SystemColor;

import proyectYane.AddDat;
@SuppressWarnings("serial")
public class goodOfwork extends JFrame {

	private JPanel contentPane;
	private JTextField NombreAP;
	private JTextField Dni;
	private JTextField domicilio;
	private JTextField Grado;
	private JTextField colegio;
	private JTextField folio;
	private JTextField libro;
	private JTextField nombrePadre;
	private JTextField nombreMadre;
	private JTextField telefono;
	private JTextField bautizadoEn;
	private JTextField fecha;
    
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					goodOfwork frame = new goodOfwork();
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
	public goodOfwork() {
		setTitle("Work of Good");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 138, 705, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fecha = new JTextField();
		fecha.setBounds(169, 47, 86, 20);
		contentPane.add(fecha);
		fecha.setColumns(10);
		
		NombreAP = new JTextField();
		NombreAP.setBounds(168, 78, 148, 20);
		contentPane.add(NombreAP);
		NombreAP.setColumns(10);
	
		
		Dni = new JTextField();
		Dni.setBounds(168, 109, 149, 20);
		contentPane.add(Dni);
		Dni.setColumns(10);
		
		
		domicilio = new JTextField();
		domicilio.setBounds(168, 140, 148, 20);
		contentPane.add(domicilio);
		domicilio.setColumns(10);
		
		
		Grado = new JTextField();
		Grado.setBounds(168, 171, 148, 20);
		contentPane.add(Grado);
		Grado.setColumns(10);
		
		
		colegio = new JTextField();
		colegio.setBounds(168, 202, 148, 20);
		contentPane.add(colegio);
		colegio.setColumns(10);
		
		
		folio = new JTextField();
		folio.setBounds(490, 54, 148, 20);
		contentPane.add(folio);
		folio.setColumns(10);
		
		
		libro = new JTextField();
		libro.setBounds(490, 85, 148, 20);
		contentPane.add(libro);
		libro.setColumns(10);
		
		
		nombrePadre = new JTextField();
		nombrePadre.setBounds(490, 116, 148, 20);
		contentPane.add(nombrePadre);
		nombrePadre.setColumns(10);
	
		
		nombreMadre = new JTextField();
		nombreMadre.setBounds(490, 147, 148, 20);
		contentPane.add(nombreMadre);
		nombreMadre.setColumns(10);
		
		
		telefono = new JTextField();
		telefono.setBounds(490, 178, 148, 20);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		
		bautizadoEn = new JTextField();
		bautizadoEn.setBounds(168, 233, 148, 20);
		contentPane.add(bautizadoEn);
		bautizadoEn.setColumns(10);
		
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Fecha= fecha.getText();
				String nombreA=NombreAP.getText();
				String dni=Dni.getText();
				String Domicilio= domicilio.getText(); 
				String grado=Grado.getText();
				String Colegio= colegio.getText();
				String Folio= folio.getText();
				String Libro= libro.getText();
				String NombrePadre=nombrePadre.getText();
				String NombreMadre= nombreMadre.getText();
				String Telefono= telefono.getText();
				String BautizadoEn= bautizadoEn.getText();
				AddDat addDat= new AddDat(Fecha,nombreA, dni, Domicilio, grado, Colegio, Folio, Libro, NombrePadre, NombreMadre, Telefono, BautizadoEn);
			addDat.ApendW();
			
			}
		});
		btnGuardar.setBounds(155, 284, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCanselar = new JButton("Nuevo");
		btnCanselar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha.setText("");
				NombreAP.setText("");
				 Dni.setText("");
				 domicilio.setText(""); 
				 Grado.setText("");
				 colegio.setText("");
				 folio.setText("");
				 libro.setText("");
				 nombrePadre.setText("");
				 nombreMadre.setText("");
				 telefono.setText("");
				 bautizadoEn.setText("");
			}
		});
		btnCanselar.setBounds(248, 284, 89, 23);
		contentPane.add(btnCanselar);
		
		JLabel lblNewLabel = new JLabel("Comunion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(291, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreYApelllido = new JLabel("Nombre y Apelllido");
		lblNombreYApelllido.setBounds(50, 84, 108, 14);
		contentPane.add(lblNombreYApelllido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(50, 115, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblDireccion = new JLabel("Domicilio");
		lblDireccion.setBounds(50, 146, 46, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(366, 181, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblNewLabel_1 = new JLabel("Libro");
		lblNewLabel_1.setBounds(366, 85, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFolio = new JLabel("Folio");
		lblFolio.setBounds(366, 57, 46, 14);
		contentPane.add(lblFolio);
		
		JLabel lblNombreDelPadre = new JLabel("Nombre del Padre");
		lblNombreDelPadre.setBounds(366, 119, 114, 14);
		contentPane.add(lblNombreDelPadre);
		
		JLabel lblNombeDeLa = new JLabel("Nombe de la Madre");
		lblNombeDeLa.setBounds(366, 150, 102, 14);
		contentPane.add(lblNombeDeLa);
		
		JLabel lblColejio = new JLabel("Colegio");
		lblColejio.setBounds(50, 208, 46, 14);
		contentPane.add(lblColejio);
		
		JLabel lblGrado = new JLabel("Grado");
		lblGrado.setBounds(50, 177, 46, 14);
		contentPane.add(lblGrado);
		
		JLabel lblBautizado = new JLabel("Bautizado  en parroquia");
		lblBautizado.setBounds(50, 239, 128, 14);
		contentPane.add(lblBautizado);
		
		JTextPane observacion = new JTextPane();
		observacion.setBackground(SystemColor.inactiveCaption);
		observacion.setBounds(416, 224, 222, 95);
		contentPane.add(observacion);
		
	
		
		JLabel lblNewLabel_2 = new JLabel("A\u00F1o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(50, 47, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblObsevacion = new JLabel("OBSEVACION");
		lblObsevacion.setBounds(366, 205, 65, 14);
		contentPane.add(lblObsevacion);
	}
}
