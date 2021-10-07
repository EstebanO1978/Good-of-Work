package proyectYane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadArch {
	 static String palabra = "265";
		static String replace = "C4";
		static String sCadena;
		 static String texto;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Leer();
		
	}
	public static void  search(){
		  boolean resultado = texto.contains(palabra);
			 
			 if(resultado){
				 texto = texto.replace(',',' ').replace('i','a');
			             //  .replace('o','a').replace('u','a');
				
				 
				 	System.out.println("palabra encontrada");
				    System.out.println(texto);
				   /* texto = texto.replace(replace,"luis");
				    System.out.println("palabra remplasada");*/
				}/*else{
				    System.out.println("palabra no encontrada");
				}*/
	}
	public static void Leer(){
try{
			
			
			//FileReader fr = new FileReader("C:/Users/Esteban/Desktop/exel.txt");
			FileReader fr = new FileReader("E:/Documentos unidad E/Eclipce/proyecto01/leerArchivos/src/leerArchivos/userpass.csv");
		BufferedReader bf = new BufferedReader(fr);
		
		while ((sCadena = bf.readLine())!=null) {
			
			    texto = sCadena;
			   texto = texto.replace(',',' ');
			 //  System.out.println(texto); 
			 search();
			 
			}
		fr.close();
		
		
		
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
