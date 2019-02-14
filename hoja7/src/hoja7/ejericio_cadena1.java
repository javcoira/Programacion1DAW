package hoja7;

import java.util.Scanner;

public class ejericio_cadena1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String miCadena;
		System.out.println("introduce frase");
		miCadena=teclado.nextLine();
		System.out.println(miCadena);
		for(int i=0;i<miCadena.length();i++){
			if(miCadena.charAt(i)!=' '){
				System.out.print(miCadena.charAt(i));
			}
			else System.out.println();
		}

	}

}
