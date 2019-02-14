package prueba2;

import java.util.Scanner;

public class ejericio2billetes {

	public static void main(String[] args) {
		int cambio[] = {500,200,100,50,20,10,5,2,1};
		int resto=0;
		
		int cantidad=0;
		
		System.out.println("Introduce cantidad: ");
		Scanner sc = new Scanner(System.in);
		cantidad = sc.nextInt();
		
		if(cantidad<0)
			System.out.println("debe ser un valor posible!");
		
		for(int i=0;i<cambio.length && cantidad>0;i++){
			resto = cantidad%cambio[i];
			cantidad = cantidad/cambio[i];
			
			if(cantidad>0)
				System.out.println("necesitas billetes: " + cantidad + " de " + cambio[i]);
			
			cantidad=resto;
		}
	}

}
