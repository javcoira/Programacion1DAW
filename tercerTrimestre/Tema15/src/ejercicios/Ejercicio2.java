package ejercicios;

import java.io.File;
import java.util.Scanner;

/*Solicita un nombre de fichero o directorio al usuario y muestra en pantalla:
-	Su ruta
-	Ruta absoluta
-	Tamaño
-	Si se puede leer
-	Si se puede escribir
-	Si es fichero
-	Si es directorio
Nota: Prueba la salida tanto para un archivo como para un directorio

*/
public class Ejercicio2 {
	  public static void main(String[] args) {

		  String nombreDoc=""; 
		  System.out.println("introduce la ruta absoluta del directorio: ");
		  Scanner sc=new Scanner(System.in);
		  nombreDoc = sc.nextLine();
	  
		  System.out.println("Ficheros en el directorio actual: ");
		  File f=new File(nombreDoc);
		  
		  System.out.println("ruta: " + f.getPath());
		  System.out.println("ruta absoluta: " + f.getAbsolutePath());
		  System.out.println("la longitud es: "+f.length());
		  System.out.println("se puede leer: " + f.canRead());
		  System.out.println("se puede escribir: " + f.canWrite());
		  System.out.println("es fichero: " + f.isFile());
		  System.out.println("es directorio: " + f.isDirectory());
	  }
}
