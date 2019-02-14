package hoja7;

import java.util.Scanner;

public class ejer_candena2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String miCadena;
		int[] misvocales = new int[5];
		System.out.println("introduce frase");
		miCadena=teclado.nextLine();
		System.out.println("cadena inicial: " + miCadena);
		boolean sw=false;
		miCadena = miCadena.toLowerCase();
		for(int i=0;i<miCadena.length();i++){
			switch(miCadena.charAt(i)){
			case 'a': misvocales[0]++;
					break;
			case 'e': misvocales[1]++;
					break;
			case 'i': misvocales[2]++;
					break;
			case 'o': misvocales[3]++;
					break;
			case 'u': misvocales[4]++;
					break;
			}
		}
		
		for(int i=0;i<misvocales.length;i++){
			if(misvocales[i]==0){
				sw=true;
				break;
			}
		}
		if(sw)
		System.out.println(miCadena + " no tiene todas las vocales");
		else System.out.println(miCadena + " tiene todas las vocales");

	}

}
