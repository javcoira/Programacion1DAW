package excepciones.repaso;

import java.util.*;

public class Prueba2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduce numero entero:");
		try {
			num = teclado.nextInt();

		} catch (InputMismatchException ex) {
			System.out.println("tipo no coincidente " +ex);
			num = 1;
		} finally {
			System.out.println("fin del programa");
		}
		System.out.println("numero "+num);
	}

}
