import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;
		while (cont < NUM) {
			try {
				System.out.println("Introduce una posición del array:");
				posicion = Integer.parseInt(teclado.nextLine());
				System.out.println("Introduce un divisor:");
				divisor = Integer.parseInt(teclado.nextLine());
				enteros[posicion] = 5 / divisor;
				//cont++;

			} catch (IndexOutOfBoundsException exc) {
				System.out.println("Fuera de rango\n");
				//exc.printStackTrace();
				System.out.println();

			} catch (NumberFormatException exc) {
				System.out.println("Solo se aceptan numeros integer, no strings o decimales\n");
				//exc.printStackTrace();
				System.out.println();

			} catch (ArithmeticException exc) {
				System.out.println("No se puede dividir por 0\n");
				//exc.printStackTrace();
				System.out.println();
	
			//el cont se pone fuera porque queremos que el bucle se ejecute solo 5 veces independientemente de si hay errores o no
			//otra forma seria ponerlo antes del try y despues del while
			}finally {
				cont++;
			}

		}
		System.out.println("El contenido del array de enteros es:");
		for (int valor : enteros) {
			System.out.println(valor);
		}
	}
}
