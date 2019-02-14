package hoja7;

import java.util.Scanner;

public class cadenas {

	public static void main(String[] args) {
		String cad1=new String ("empezamos");
		String cad2="tenemos ejericios pendientes";
		String cad3=new String(cad2);
		String cad4,cad5;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce cadena a buscar");
		cad4=teclado.next();
		if(cad1.equals(cad4)){
			System.out.println(cad1 + " son iguales " + cad4);
		}else{
			System.out.println(cad1 + " no son iguales " + cad4);
		}
		cad5=cad2.substring(0, 3);
		System.out.println(cad5 + " de 0 a 3");
	}

}
