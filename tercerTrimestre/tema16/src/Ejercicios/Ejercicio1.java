/*1.- Realiza un programa en JAVA en el que muestre un menú que te permita 3 opciones:
1. Creacion de un fichero de texto (con el nombre que tu quieras) en el que indiques en 3 lineas diferentes

Tu Nombre.
Tus Apellidos.
Tu Ciudad de Nacimiento.

2. Mostrar por pantalla el contenido del fichero de texto creado.

3. Salir del Programa.
Recuerda que debes controlar las excepciones que puedan aparecer.
*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void mostrarMenu() {
		System.out.println("Menu: \n\t1.Crea fichero de texto con tus datos\n\t2.Mostrar tus datos\n\t3.Salir");
	}
	
	public static void crearFichero(File fichero) throws FileNotFoundException{
		String dato;
        try {
		FileWriter fW = new FileWriter(fichero);
        BufferedWriter bW = new BufferedWriter(fW);

        System.out.println("Escribe Nombre: ");
        Scanner sc = new Scanner(System.in);
       dato = sc.nextLine();
        bW.write("\tNombre:  " + dato);
        bW.newLine();
        
        System.out.println("Escribe Apellidos: ");
        dato = sc.nextLine();
        bW.write("\tApellidos:  " + dato);
        bW.newLine();
        
        System.out.println("Escribe Ciudad: ");
        dato = sc.nextLine();
        bW.write("\tCiudad:  " + dato);
        bW.newLine();
        
        bW.close();
        
        }catch(IOException ex) {
        	System.out.println("error "+ ex.getMessage());
        }
	}
	
	public static void leerFichero(File fichero){
       try {
		FileReader fR = new FileReader(fichero);
        BufferedReader bR = new BufferedReader(fR);
        String cadena;
        System.out.println("\nDatos de la persona: ");
        while ((cadena = bR.readLine()) != null) {
            System.out.println(cadena);
        }
        bR.close();
       }catch(IOException ex) {
    	   System.out.println("Error " + ex);
       }
    }

	public static void main(String[] args) {
		int opcion=0;
		mostrarMenu();
		try {
		File fichero = new File("c:\\adb\\datos.txt");
		while (opcion != 3) {
			System.out.println("\nEscoger una opcion:  ");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			if (opcion == 1) {
				crearFichero(fichero);
			}else if (opcion == 2) {
				leerFichero(fichero);
			}else
				System.out.println("no existe esa opcion!");
		}
		System.out.println("fin");
		}catch(FileNotFoundException ex) {
        	System.out.println("error "+ ex.getMessage());
        }catch(InputMismatchException ex) {
        	System.out.println("error "+ ex.getMessage());
        }
	}

}
