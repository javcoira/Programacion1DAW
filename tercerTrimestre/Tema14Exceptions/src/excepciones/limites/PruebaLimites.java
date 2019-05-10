package excepciones.limites;

import java.util.*;

public class PruebaLimites {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int temp, dormir;
		System.out.println("Introduce temperatura:");
		temp = teclado.nextInt();
		System.out.println("Introduce horas de sueño:");
		dormir = teclado.nextInt();

		try {
			if (temp > 40)
				throw new DemasiadoCalor();
			if (dormir < 8)
				throw new DemasiadoCansado();
			System.out.println("Temperatura " + temp + " sueño " + dormir);
		} catch (Limites lim) {
			if (lim instanceof DemasiadoCalor)
				System.out.println("Captura excepcion temperatura");
			else
				System.out.println("Captura excepcion sueño insuficiente");
		} finally {
			System.out.println("FIN");
		}
	}

}
