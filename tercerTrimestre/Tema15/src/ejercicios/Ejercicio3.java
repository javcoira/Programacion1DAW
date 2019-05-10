package ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		File carpeta= new File("src");
		String nombreDirectorio, nombreFichero;
		System.out.println("Intro nombre del directorio: ");
		nombreDirectorio=sc.next();
		File ruta = new File(carpeta, nombreDirectorio);
		if(!ruta.exists()) {
			ruta.mkdir();
		}
			System.out.println("Intro nombre de un fichero 1: ");
			nombreFichero=sc.next();
			File fichero1=new File(ruta, nombreFichero);
			System.out.println("Intro nombre de un fichero 2: ");
			nombreFichero=sc.next();
			File fichero2=new File(ruta, nombreFichero);
			fichero1.createNewFile();
			fichero2.createNewFile();
			String contenido[] = ruta.list();
			System.out.println("Listado del contenido del directorio " + ruta.getAbsolutePath());
			for(int i=0;i<contenido.length;i++) {
				System.out.println(contenido[i]);
			}
			System.out.println("Intro nuevo nombre: ");
			nombreFichero=sc.next();
			File nuevo=new File(ruta, nombreFichero);
			fichero2.renameTo(nuevo);
			contenido = ruta.list();
			System.out.println("Listado del contenido del directorio " + ruta.getAbsolutePath());
			for(int i=0;i<contenido.length;i++) {
				System.out.println(contenido[i]);
			}
	}
}
