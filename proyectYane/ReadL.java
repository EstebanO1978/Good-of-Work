package proyectYane;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ReadL {

public static String texto;
  public ReadL(){
   // ReadF();
  }
    
  public static void ReadF(){
  try{
    String pathArch = "E:/Documentos unidad E/Eclipce/proyecto01/filecrea/Arch.csv";
  FileReader fr= new FileReader(pathArch);
  BufferedReader bf = new BufferedReader(fr);
  String read;
  while ((read =bf.readLine())!=null){ 
  texto= read;
  System.out.println(read);}
  bf.close();
  fr.close();
  }catch (IOException e){
    System.out.println(e);
  }
  }
  
}
