package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class segundaCollection {

	public static void main(String[] args){

		Scanner tc = new Scanner(System.in);
		HashMap<Integer, String> mapaAsig = new HashMap<Integer, String>();
		String asig;
		int numero;
		
		for(int i=1;i<4;i++) {
			System.out.println("Introduce asigantura: ");
			asig = tc.next();
			mapaAsig.put(i, asig);
		}
		System.out.println(mapaAsig);
		
		System.out.println("introdue codigo de asignatura: ");
		numero = tc.nextInt();
		asig = mapaAsig.get(numero);
		System.out.println(asig);
	}
}
