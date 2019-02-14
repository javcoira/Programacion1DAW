package hoja7;

import java.util.Scanner;

public class ejer_cadena4 {

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		String miCadena,cad;
		System.out.println("introduce frase");
		miCadena = tc.nextLine();
		cad = miCadena.toUpperCase();
		System.out.println("cadena inicial " + miCadena);
		for(int i=0;i<cad.length();i++){
			if(cad.charAt(i)!=' '){
				System.out.print(cad.charAt(i));
			}
		}
		System.out.println();
		System.out.println(miCadena);

	}

}
