package proyectYane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
public class AddDat {

private String NombreApelldido,DNI,FechaN,NomPadre,NomMadre,Domicilo ,Telefono,Grado,Colegio,BautizadoParroqui,Folio,Librio,Obesevacion;
//private String DNI;
 
   
  
  public String getNombreApelldido() {
	return NombreApelldido;
}


public void setNombreApelldido(String nombreApelldido) {
	NombreApelldido = nombreApelldido;
}


public String getDNI() {
	return DNI;
}


public void setDNI(String dNI) {
	DNI = dNI;
}

public String getFechaN() {
	return FechaN;
}


public void setFechaN(String fechaN) {
	FechaN = fechaN;
}
  
 


public String getDomicilo() {
	return Domicilo;
}


public void setDomicilo(String domicilo) {
	Domicilo = domicilo;
}


public String getTelefono() {
	return Telefono;
}


public void setTelefono(String telefono) {
	Telefono = telefono;
}
public String getGrado() {
	return Grado;
}


public void setGrado(String grado) {
	Grado = grado;
}


public String getColegio() {
	return Colegio;
}


public void setColegio(String colegio) {
	Colegio = colegio;
}


public String getBautizadoParroqui() {
	return BautizadoParroqui;
}


public void setBautizadoParroqui(String bautizadoParroqui) {
	BautizadoParroqui = bautizadoParroqui;
}


public String getFolio() {
	return Folio;
}


public void setFolio(String folio) {
	Folio = folio;
}


public String getLibrio() {
	return Librio;
}


public void setLibrio(String librio) {
	Librio = librio;
}


public String getNomPadre() {
	return NomPadre;
}


public void setNomPadre(String nomPadre) {
	NomPadre = nomPadre;
}


public String getNomMadre() {
	return NomMadre;
}


public void setNomMadre(String nomMadre) {
	NomMadre = nomMadre;
}


public String getObesevacion() {
	return Obesevacion;
}


public void setObesevacion(String obesevacion) {
	Obesevacion = obesevacion;
}


public  void ApendW(){
 
    BufferedWriter bw = null;
    FileWriter fw = null;

    try {
        String data = NombreApelldido+","+DNI+","+FechaN +","+ Domicilo+","+Telefono+","+Grado+","+ Colegio+","+BautizadoParroqui+","+Folio+","+Librio+","+NomPadre+","+NomMadre+","+Obesevacion;
        String path = "E:/Documentos unidad E/Eclipce/proyecto01/proyectYane/src/proyectYane/arch2.csv";
        File file = new File(path);
        // Si el archivo no existe, se crea!
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("archivo creado");
        }
        // flag true, indica adjuntar información al archivo.
        fw = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);
        bw.write(data+",\n");
        System.out.println("informacion agregada!"+data);
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
                        //Cierra instancias de FileWriter y BufferedWriter
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
      // inputDat.close();
       } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
  }







public AddDat(String nombreApelldido, String dNI,String fechaN, String domicilo, String telefono,
		String grado, String colegio, String bautizadoParroqui, String folio,
		String librio, String nomPadre, String nomMadre, String obesevacion) {
	super();
	this.NombreApelldido = nombreApelldido;
	this.DNI = dNI;
	this.FechaN=fechaN;
	this.Domicilo = domicilo;
	this.Telefono=telefono;
	this.Grado = grado;
	this.Colegio = colegio;
	this.BautizadoParroqui = bautizadoParroqui;
	this.Folio = folio;
	this.Librio = librio;
	this.NomPadre = nomPadre;
	this.NomMadre = nomMadre;
	this.Obesevacion = obesevacion;
}


}





