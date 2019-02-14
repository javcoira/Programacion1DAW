package examen;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		int valmin, valmax;
		int num1=0, num2;
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce el maximo");
		valmax = teclado.nextInt();
		System.out.println("introduce el minimo");
		valmin = teclado.nextInt();
		
		//ojo a como se hace el random.
		num1=(int)(Math.random()*(valmax-valmin+1) + valmin);
		num2=(int)(Math.random()*(valmax-valmin+1) + valmin);
		System.out.println("num1 = " + num1 + " y num2 = " + num2);
		if(num1==num2){
			System.out.println("cierto son iguales");
		}else{
			System.out.println("no es cierto que son iguales");
		}
		if(num1%2==0 && num2%2==0){
			System.out.println("es cierto que los 2 son pares");
			System.out.println("es cierto que alguno es multiplo de 2");
		}else{
			System.out.println("no es cierto que los 2 son pares");
			if(num1%2==0 || num2%2==0){
				System.out.println("es cierto que alguno es multiplo de 2");
			}else{
				System.out.println("no es cierto que alguno es multiplo de 2");
			}
		}

	}

}
