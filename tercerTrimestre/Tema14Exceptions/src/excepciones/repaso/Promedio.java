package excepciones.repaso;

import java.util.*;

public class Promedio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota = 0, contador = 0, suma = 0;
		double media = 0;
		do {
			try {
				System.out.println("Intro nueva nota");
				nota = teclado.nextInt();
				if (nota<0 || nota>10) throw new NotaInvalida();
				if (nota != -1) {
					contador++;
					suma += nota;
				}}
			 catch (InputMismatchException ex) {
				System.out.println("nota incorrecta "+ex);
				teclado.next();
			 }
			catch (NotaInvalida ex) {
				System.out.println("Entrando en catch de nota invalida "+nota);
				System.out.println("capturado error "+ex);
				
			}
			
		} while (nota != -1);
		System.out.println("Has leido " + contador + " notas");
		media = ((double) suma / (double) contador);
		System.out.println("La media es " + media);
	}

}
