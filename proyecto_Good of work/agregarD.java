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
	private JTextField NyA;
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
public String nombreyA,dni,fechaNacido,nPadre,nMadre,domicilio,nTelefono,colegio,nGrado,bautizado,hoja,folio,observa;
private JTextField ObservacionA;
private JTextField FechaNacimiento;
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
		setTitle("Carga de datos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 0, 0);
		contentPane.add(textField);
		textField.setColumns(10);
		
		NyA = new JTextField();
		NyA.setBounds(197, 24, 183, 20);
		contentPane.add(NyA);
		NyA.setColumns(10);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido");
		lblNombreYApellido.setBounds(23, 26, 130, 14);
		contentPane.add(lblNombreYApellido);
		
		DnI = new JTextField();
		DnI.setBounds(197, 55, 183, 20);
		contentPane.add(DnI);
		DnI.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(23, 57, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblNewLabel = new JLabel("Nombre del Padre");
		lblNewLabel.setBounds(23, 116, 130, 14);
		contentPane.add(lblNewLabel);
		
		Npadre = new JTextField();
		Npadre.setBounds(197, 119, 183, 20);
		contentPane.add(Npadre);
		Npadre.setColumns(10);
		
		Nmadre = new JTextField();
		Nmadre.setColumns(10);
		Nmadre.setBounds(197, 150, 183, 20);
		contentPane.add(Nmadre);
		
		domicilioA = new JTextField();
		domicilioA.setColumns(10);
		domicilioA.setBounds(197, 181, 183, 20);
		contentPane.add(domicilioA);
		
		Ntelefono = new JTextField();
		Ntelefono.setColumns(10);
		Ntelefono.setBounds(197, 210, 183, 20);
		contentPane.add(Ntelefono);
		
		colegioA = new JTextField();
		colegioA.setColumns(10);
		colegioA.setBounds(197, 241, 183, 20);
		contentPane.add(colegioA);
		
		Ngrado = new JTextField();
		Ngrado.setColumns(10);
		Ngrado.setBounds(197, 272, 183, 20);
		contentPane.add(Ngrado);
		
		bautizadoEn = new JTextField();
		bautizadoEn.setColumns(10);
		bautizadoEn.setBounds(197, 303, 183, 20);
		contentPane.add(bautizadoEn);
		
		hojaB = new JTextField();
		hojaB.setColumns(10);
		hojaB.setBounds(197, 333, 183, 20);
		contentPane.add(hojaB);
		
		folioB = new JTextField();
		folioB.setColumns(10);
		folioB.setBounds(197, 364, 183, 20);
		contentPane.add(folioB);
		
		lblNewLabel_1 = new JLabel("Nombre de la Madre");
		lblNewLabel_1.setBounds(23, 147, 143, 14);
		contentPane.add(lblNewLabel_1);
		
		lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(23, 176, 90, 14);
		contentPane.add(lblDomicilio);
		
		lblNTelefono = new JLabel("N\u00BA Telefono");
		lblNTelefono.setBounds(23, 207, 90, 14);
		contentPane.add(lblNTelefono);
		
		lblColegio = new JLabel("Colegio");
		lblColegio.setBounds(23, 238, 90, 14);
		contentPane.add(lblColegio);
		
		lblGrado = new JLabel("Grado");
		lblGrado.setBounds(23, 269, 90, 14);
		contentPane.add(lblGrado);
		
		lblBautisadoEn = new JLabel("Bautisado en");
		lblBautisadoEn.setBounds(23, 299, 143, 14);
		contentPane.add(lblBautisadoEn);
		
		lblHoja = new JLabel("Hoja");
		lblHoja.setBounds(23, 330, 90, 14);
		contentPane.add(lblHoja);
		
		lblFolio = new JLabel("Folio");
		lblFolio.setBounds(23, 370, 90, 14);
		contentPane.add(lblFolio);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarDatos();
				AddDat add= new AddDat(nombreyA,dni,fechaNacido,nPadre,nMadre,domicilio,nTelefono,colegio,nGrado,bautizado,hoja,folio,observa);
			    add.ApendW();
			    NyA.setText("");
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
		btnGuardar.setBounds(417, 267, 113, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Volver");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 dispose();
			}
		});
		btnCancelar.setBounds(417, 313, 113, 23);
		contentPane.add(btnCancelar);
		
		lblObservacin = new JLabel("Observaci\u00F3n");
		lblObservacin.setBounds(413, 43, 90, 14);
		contentPane.add(lblObservacin);
		
		ObservacionA = new JTextField();
		ObservacionA.setBounds(392, 82, 138, 20);
		contentPane.add(ObservacionA);
		ObservacionA.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(23, 91, 99, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		FechaNacimiento = new JTextField();
		FechaNacimiento.setBounds(197, 88, 183, 20);
		contentPane.add(FechaNacimiento);
		FechaNacimiento.setColumns(10);
	}
	public void AgregarDatos(){
		nombreyA= NyA.getText() ;
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
