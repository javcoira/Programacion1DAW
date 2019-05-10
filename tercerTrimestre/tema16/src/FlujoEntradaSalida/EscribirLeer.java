/*Ejecicio 2 
crea la clase EscribirLeer, que incluya el metodo main para probar los  metodos
public static void escribeFichero(FileWriter fw,String cadena) throws IOException
public static void leeFichero(FileReader fr) throws IOException
En main debe pedirse al usuario que escriba una cadena, que se guardará en un fichero invocando a escribeFichero y posteriormente se leeará el fichero invocando a leeFichero
*/

package FlujoEntradaSalida;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirLeer {
	
	public static void escribeFichero(FileWriter fw,String cadena) throws IOException{
		fw.write(cadena);
        //Guardamos los cambios del fichero evita tener que cerrar el fichero
        fw.flush();
	}
	
	public static void leeFichero(FileReader fr) throws IOException{
		int valor=fr.read();
        while(valor!=-1){
            System.out.print((char)valor);
            valor=fr.read();
        }

	}
	
	public static void main(String... args) throws IOException {
		String nombreDoc;
		String texto;
		System.out.println("Introduce el nombre del archivo que quieres crear: ");
		Scanner sc=new Scanner(System.in);
		nombreDoc = sc.nextLine();
		System.out.println("Escribe el texto a introducit en el documento: ");
		texto=sc.nextLine();
		FileWriter fw = new FileWriter("c:\\adb\\"+ nombreDoc+".py");
		escribeFichero(fw,texto);
		FileReader fr = new FileReader("c:\\adb\\"+nombreDoc+".py");
		leeFichero(fr);
		fr.close();
		fw.close();
		
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce.. ");
		String archivo= sc.nextLine();
		System.out.println("Introduce lo que... ");
		String frase= sc.nextLine();
		try {
			FileWriter fw = new FileWriter("c:\\adb\\"+archivo+".py");
			escribeFichero(fw,frase);
			FileReader fr = new FileReader("c:\\adb\\"+archivo+".py");
			leeFichero(fr);
			fr.close();
			fw.close();
		}catch(IOException ex) {
			System.out.println("error de E/S" + ex);
		}*/
		
	}
}
