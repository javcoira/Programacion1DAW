package hoja7;

import java.util.Scanner;

public class ejer_cadena5 {
	
	public static String limBlancos(String cadena){
		String cad= cadena.toUpperCase();
		String salida="";
		for(int i=0;i<cad.length();i++){
			if(cad.charAt(i)!=' '){
				salida+=cad.charAt(i);
			}
		}
		return salida;
	}

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		String miCadena,cad;
		System.out.println("introduce frase");
		miCadena = tc.nextLine();
		cad = limBlancos(miCadena);
		medio =(int) cad.length()/2;
		for(i=0,j=cad.lengt()-1;i<medio;i++,j--){
			if(cad.charAt(i) != cad.charAt(j)){
				sw=false;
				break;
			}
		}
		
		if(sw)
			System.out.println(miCadena+ " es palindromo");
		else
			System.out.println(miCadena+ " no es palindromo");

	}

}
