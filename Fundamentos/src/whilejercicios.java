
import java.util.Scanner;

public class whilejercicios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,i=0,suma=0,num1,num2,parejas,actual=0,anterior=0,cont=0;
		boolean sw=true;
		
		/*Programa que lee números mientras la suma de todos ellos no llegue a 100. Muestra al final cuántos números se han introducido.
		 */
		/*while(suma<100){
			System.out.println("introduce un numero");
			numero = teclado.nextInt();
			i++;
			suma+=numero;
		}
		System.out.println("tu acumulado es " + suma);
		System.out.println("has necesitado " + i+ " entradas");*/

		/*Programa que lee de manera consecutiva números hasta que se introducen dos números iguales seguidos*/
		/*System.out.println("introduce 2 numeros");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		parejas=1;
		while(num1!=num2){
			System.out.println("introduce 2 numeros");
			num1=teclado.nextInt();
			num2=teclado.nextInt();
			parejas++;
		}
		System.out.println("has introducido " + parejas + " parejas de numeros");
		System.out.println("finalizaste con " + num2);*/
		
		/*---------------------- otra version ----------------------------------------------*/
		while(sw){
			System.out.println("introduce un numero");
			actual=teclado.nextInt();
			cont++;
			if(anterior==actual){
				sw=false;
			}
			else{
				anterior=actual;
			}
		}
		System.out.println("has introducido " + cont + " numeros");
		System.out.println("finalizaste con " + actual);
	}

}
