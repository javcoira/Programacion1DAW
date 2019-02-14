import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList();
		int num = 0;
		int mayor = 0;
		double media = 0;

		System.out.println("Introduce numeros, para parar introduce '-99'");
		do {
			System.out.println("Introduce numero");
			num = sc.nextInt();
			if (num == -99) {
				System.out.println("Fin");
				break;
			} else {
				numeros.add(num);
			}
		} while (true);
		
		//while(sc.nextInt()!=-99)
		//numeros.remove(-99);

		num = 0;

		System.out.println("elementos dentro de ArrayList");
		for (int i = 0; i < numeros.size(); i++)
			System.out.println(numeros.get(i));

		/*
		 * System.out.println("suma de los valores introducidos: "); for(Object obj:
		 * numeros) { num+= numeros.get(obj); }
		 */

		Iterator it = numeros.iterator();
		while (it.hasNext()) {
			num += (Integer) it.next();
		}

		/*
		 * for(int i=0;i<numeros.size();i++) { num+=numeros.get(i); }
		 */

		System.out.println("\nSuma: " + num);
		media = (double) num / numeros.size();
		System.out.println("\nMedia: " + media);

		System.out.println("\nMuestra de numeros y media");
		
		it = numeros.iterator();
		while (it.hasNext()) {
			if (media < (Integer) it.next()) {
				System.out.println(it.next() + " Es mayor que la media " + media);
			} else if (media > (Integer) it.next()) {
				System.out.println(it.next() + " Es menor que la media " + media);
			} else if ((Integer) it.next() == media) {
				System.out.println(it.next() + " Es igual que la media " + media);
			} else {
				System.out.println("no determinado");
			}
		}
	}
}
