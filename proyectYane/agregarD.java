package proyectYane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class agregarD extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textNyA;
	private JTextField DnI;
	private JTextField Npadre;
	private JTextField Nmadre;
	private JTextField domicilioA;
	private JTextField Ntelefono;
	private JTextField colegioA;
	private JTextField Ngrado;
	private JTextField bautizadoEn;
	private JTextField hojaB;
	private JTextField folioB;
	private JLabel lblNewLabel_1;
	private JLabel lblDomicilio;
	private JLabel lblNTelefono;
	private JLabel lblColegio;
	private JLabel lblGrado;
	private JLabel lblBautisadoEn;
	private JLabel lblHoja;
	private JLabel lblFolio;
	private JLabel lblObservacin;
public String nombreyA,dni,nPadre,nMadre,domicilio,nTelefono,colegio,nGrado,bautizado,hoja,folio,observa;
private JTextField ObservacionA;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarD frame = new agregarD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public agregarD() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 0, 0);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textNyA = new JTextField();
		textNyA.setBounds(134, 23, 183, 20);
		contentPane.add(textNyA);
		textNyA.setColumns(10);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido");
		lblNombreYApellido.setBounds(23, 26, 101, 14);
		contentPane.add(lblNombreYApellido);
		
		DnI = new JTextField();
		DnI.setBounds(134, 54, 183, 20);
		contentPane.add(DnI);
		DnI.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(23, 57, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblNewLabel = new JLabel("Nombre del Padre");
		lblNewLabel.setBounds(23, 88, 101, 14);
		contentPane.add(lblNewLabel);
		
		Npadre = new JTextField();
		Npadre.setBounds(134, 85, 183, 20);
		contentPane.add(Npadre);
		Npadre.setColumns(10);
		
		Nmadre = new JTextField();
		Nmadre.setColumns(10);
		Nmadre.setBounds(134, 116, 183, 20);
		contentPane.add(Nmadre);
		
		domicilioA = new JTextField();
		domicilioA.setColumns(10);
		domicilioA.setBounds(134, 147, 183, 20);
		contentPane.add(domicilioA);
		
		Ntelefono = new JTextField();
		Ntelefono.setColumns(10);
		Ntelefono.setBounds(134, 176, 183, 20);
		contentPane.add(Ntelefono);
		
		colegioA = new JTextField();
		colegioA.setColumns(10);
		colegioA.setBounds(134, 207, 183, 20);
		contentPane.add(colegioA);
		
		Ngrado = new JTextField();
		Ngrado.setColumns(10);
		Ngrado.setBounds(134, 238, 183, 20);
		contentPane.add(Ngrado);
		
		bautizadoEn = new JTextField();
		bautizadoEn.setColumns(10);
		bautizadoEn.setBounds(134, 269, 183, 20);
		contentPane.add(bautizadoEn);
		
		hojaB = new JTextField();
		hojaB.setColumns(10);
		hojaB.setBounds(134, 299, 183, 20);
		contentPane.add(hojaB);
		
		folioB = new JTextField();
		folioB.setColumns(10);
		folioB.setBounds(134, 330, 183, 20);
		contentPane.add(folioB);
		
		lblNewLabel_1 = new JLabel("Nombre de la Madre");
		lblNewLabel_1.setBounds(23, 119, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(23, 150, 90, 14);
		contentPane.add(lblDomicilio);
		
		lblNTelefono = new JLabel("N\u00BA Telefono");
		lblNTelefono.setBounds(23, 179, 90, 14);
		contentPane.add(lblNTelefono);
		
		lblColegio = new JLabel("Colegio");
		lblColegio.setBounds(23, 210, 90, 14);
		contentPane.add(lblColegio);
		
		lblGrado = new JLabel("Grado");
		lblGrado.setBounds(23, 241, 90, 14);
		contentPane.add(lblGrado);
		
		lblBautisadoEn = new JLabel("Bautisado en");
		lblBautisadoEn.setBounds(23, 272, 90, 14);
		contentPane.add(lblBautisadoEn);
		
		lblHoja = new JLabel("Hoja");
		lblHoja.setBounds(23, 302, 90, 14);
		contentPane.add(lblHoja);
		
		lblFolio = new JLabel("Folio");
		lblFolio.setBounds(23, 333, 90, 14);
		contentPane.add(lblFolio);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarDatos();
				AddDat add= new AddDat(nombreyA,dni,nPadre,nMadre,domicilio,nTelefono,colegio,nGrado,bautizado,hoja,folio,observa);
			    add.ApendW();
			    textNyA.setText("");
			    Npadre.setText("");
			    Nmadre.setText("");
			    DnI.setText(" ");
			    domicilioA.setText("");
			    Ntelefono.setText("");
			    colegioA.setText("");
			    Ngrado.setText("");
			    bautizadoEn.setText("");
			    hojaB.setText("");
			    folioB.setText("");
			    ObservacionA.setText("");
			}
		});
		btnGuardar.setBounds(329, 297, 113, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Volver");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 dispose();
			}
		});
		btnCancelar.setBounds(329, 328, 113, 23);
		contentPane.add(btnCancelar);
		
		lblObservacin = new JLabel("Observaci\u00F3n");
		lblObservacin.setBounds(359, 41, 90, 14);
		contentPane.add(lblObservacin);
		
		ObservacionA = new JTextField();
		ObservacionA.setBounds(346, 67, 138, 20);
		contentPane.add(ObservacionA);
		ObservacionA.setColumns(10);
	}
	public void AgregarDatos(){
		nombreyA= textNyA.getText() ;
		dni= DnI.getText();
		nPadre= Npadre.getText();
		nMadre= Nmadre.getText();
		domicilio= domicilioA.getText();
		nTelefono= Ntelefono.getText();
		colegio= colegioA.getText();
		nGrado= Ngrado.getText();
		bautizado= bautizadoEn.getText();
		
		hoja= hojaB.getText();
		folio= folioB.getText();
		observa= ObservacionA.getText();
	}
}
