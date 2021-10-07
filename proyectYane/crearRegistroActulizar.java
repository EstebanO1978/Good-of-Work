package proyectYane;

//import fileCrea.crearRegistroActulizar;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

 public class crearRegistroActulizar {
 private String busc;
 private String replace;
 private String change;
 public String pathReader;
 public String pathWrite;
 public String texto;
 private boolean deleteTF= false;
 //obtener directodio de lectura
 public String getPathReader() {
	return pathReader;
}
 public void setPath(String pathReader,String pathWrite) {
	this.pathReader = pathReader;
	this.pathWrite= pathWrite;
}
public String getReplace() {
	return replace;
}
public void update(){
   
   try {

//creo objeto fille con directorio en el que se escrivira
File file= new File(pathWrite);
//verifico si el archivo esxiste si no existe se crea pero si Si existe lo borro para crear uno nuevo en blanco
	 if (!file.exists()){ 
	 file.createNewFile();
	System.out.println("Archivo creado");
	
	}else{
		System.out.println("El archivo ya existe");
	file.delete();
	}

	//creo objero del archivo a leer
FileReader fr= new FileReader(pathReader);
  BufferedReader bf = new BufferedReader(fr);
  
  //vsriable que determina si los datos buscados existen
  String read;
  boolean resultado= false;
  
  System.out.println("se remplasara "+busc+" por "+change);
  //siclo para leer y buscar 
  while ((read =bf.readLine())!=null){ 
  texto=read;//variable que almacena lo que se va leyendo
  boolean validate= true;
  if (!file.exists()){ //si no existe el srchivo a escrivir lo creo
	 file.createNewFile();
  FileWriter  fwA = new FileWriter(file.getAbsoluteFile(), true);	//configuro el objeto para agregar sin borrar contenido
  BufferedWriter bwA = new BufferedWriter(fwA);
  //Agregobdatos vacios para iniciar el archivo
        bwA.write("");
       // cierro el buffer y el archivo
        bwA.close();
        fwA.close();}
  System.out.println(read);//imprimo lo leido
   resultado = texto.contains(busc);//busco
  
  //si la variable contiene los datos los remplazo
  
  if(resultado){
	  if(deleteTF==true){
			validate= false;
	  }
 	texto = texto.replace(busc,change);//remplazas datos l
     System.out.println("palabra encontrada "+resultado+" se replazo por "+texto);
    
}
 
 //escribo los datos remplazados creando un nuevo objeto file
FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
     BufferedWriter bw = new BufferedWriter(fw);
     if(validate== true){
    	bw.write(texto+"\n");
     	
     }
        System.out.println("informaciòn agregada!");
        //cierro el objeto y buffer
        bw.close();
        fw.close();
  
    }
 
    //cierro buffer y objeto file de lectura
   bf.close() ;
   fr.close(); 
  
   //creo un nuebo objeto file para renombrar y sobre escribir el archivo original leido
   File newFil = new File("E:/Documentos unidad E/Eclipce/proyecto01/filecrea/Arch.csv");
   newFil.delete();
   file.renameTo(newFil);
   System.out.println("Renombrado");
    // }
	//vontrol de errores
	
} catch (IOException e){
	  e.printStackTrace();
  }
}
//metodo para ingresar dato a buscar y remplazar
public void setBusc(String busc) {
	this.busc = busc;
  }
  //metodo para ingresar dato para remplazar
public void setChange(String change) {
	this.change = change;
  }
public void setDeletTF(boolean deleteTF){
	this.deleteTF= deleteTF;
}

}
