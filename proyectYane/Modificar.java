package proyectYane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Modificar {
public static String texto;
  public Modificar(){
    search();
  }
  
  public static void  search(){
  
  try{
  System.out.println("ingrese palabra a remplazar: ");
  Scanner inputScn= new Scanner(System.in);
 String busc= inputScn.nextLine();
 System.out.println("buscar: "+ busc);
  String palabra= busc;
  
  String pathArch = "E:/Documentos unidad E/Eclipce/proyecto01/filecrea/Arch.csv";
  FileReader fr= new FileReader(pathArch);
  BufferedReader bf = new BufferedReader(fr);
  String read;
  boolean resultado= false;
boolean notEn = true;
int i=0;

 while ((read =bf.readLine())!=null){ 
  texto= read;
  
   resultado = texto.contains(palabra);
			 
if(resultado){
  System.out.println("palabra encontrada = "+texto);
System.out.println("Remplasar por: ");
  String remp= inputScn.nextLine();
texto = texto.replace(',',' ').replace(busc,remp);	

i+=1;
System.out.println("se remplaso "+busc+" "+remp+" "+texto);
				}
 if(!resultado) {
 notEn = false ;}
  
  }
  
if(i>0) {System.out.println("se encontraron "+i+"resultados");} else if(!notEn){System.out.println("no existe");}
   bf.close();
    fr.close();
    inputScn.close();
    
  }catch (IOException e){
    System.out.println(e);
  }		
    
	}
}
