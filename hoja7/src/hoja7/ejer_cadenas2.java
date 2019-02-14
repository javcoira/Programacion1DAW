package hoja7;

import java.util.Scanner;

public class ejer_cadenas2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String miCadena;
		System.out.println("introduce frase");
		miCadena=teclado.nextLine();
		System.out.println("cadena inicial " + miCadena);
		int cont=0;
		miCadena = miCadena.toLowerCase();
		for(int i=0;i<miCadena.length();i++){
			switch(miCadena.charAt(i)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				cont ++;
			}
		}
		System.out.println(miCadena + " tiene " + cont + " vocales");

	}

}
