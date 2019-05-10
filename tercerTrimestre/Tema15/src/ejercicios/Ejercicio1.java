package ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

	  public static void main(String[] args) {

		  String nombreDoc=""; 
		  
		  System.out.println("introduce la ruta absoluta del directorio: ");
		  Scanner sc=new Scanner(System.in);
		  nombreDoc = sc.nextLine();
		  
	        System.out.println("Ficheros en el directorio actual: ");
	        File f=new File(nombreDoc);
	        
	        if(!f.exists()) {
	        	System.out.println("esa ruta no existe");
	        }else {
	        //Probad con "..", ¿qué archivos muestra?"
	        
	        String []archivos=f.list();
	        
	        for (int i=0; i< archivos.length; i++)
	        {
	            System.out.println(archivos[i]);
	        }
	        }
	  }
}
