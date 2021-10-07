package proyectYane;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class CreateNew {
  public CreateNew(){
   // wirte();
  }
  
  public static void write(){
  try{
  System.out.println("Ingrece nombre de archivo");
  //Scanner inputN= new Scanner(System.in);
 String nameA = null ;//inputN.nextLine();
  
String pathArch ="E:/Documentos unidad E/Eclipce/proyecto01/filecrea/"+ nameA+".csv";

File file = new File(pathArch);
if (!file.exists()) {
            file.createNewFile();
      System.out.println("no existe el archivo por lo que se a creado");
        
        }else {
          System.out.println("ya existe el archivo");}
FileReader fr= new FileReader(pathArch);
  BufferedReader bf = new BufferedReader(fr);
  String read;
  while ((read =bf.readLine())!=null){ 
  
  System.out.println(read);}
  
     PrintWriter pw= new PrintWriter(pathArch);
//la ruta deve ser esacta si el archivo existe lo sobre escribe
  
    
  
/*if (!nuevoF.exists()) {
    System.out.println("archivo creado");
    
 
} else { System.out.println("el archivo ya existe");}*/


  // pw.write("mundo bien");
   pw.append("ok");//agrega contenido
   pw.close();
    
   bf.close() ;
   fr.close(); 
  
   //crea archivo con fileWrite
   // FileWriter fW= new FileWriter(pathArch); //la ruta del archivo debe ser la esacta
 //fW.append("g flaco");
// fW.close();
    
    } catch (IOException e){
      System.out.println(e);
    }
  
  }
}
