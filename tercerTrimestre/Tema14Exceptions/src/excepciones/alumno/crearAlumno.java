package excepciones.alumno;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class crearAlumno {

	public static void main(String[] args) {
		Alumno[] misAlumnos=new Alumno[2];
		Scanner sc=new Scanner(System.in);
		int edad;
		double nota;
		String nombre;
		for(int i=0;i<misAlumnos.length;i++) {
			try {
			System.out.println("introduce nombre: ");
			nombre=sc.next();
			System.out.println("introduce edad: ");
			edad=sc.nextInt();
			misAlumnos[i]= new Alumno(nombre,edad);
			System.out.println("introduce nota: ");
			nota=sc.nextDouble();
			misAlumnos[i].setNota(nota);
			}catch(InputMismatchException ex) {
				System.out.println("error" + ex);
				// se pone porque hay un intro perdido
				sc.next();
			}
		}
		
		for(int i=0;i<misAlumnos.length;i++) {
			try {
			System.out.println(misAlumnos[i].toString());
			}catch(NullPointerException ex) {
				System.out.println("incorrecto : "+ex);
			}
		}
	}
	
}
