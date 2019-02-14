import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> misCantantes = new ArrayList();
		if(misCantantes.add("Diana Krall"))
				System.out.println("añadido");
		misCantantes.add("Pepe Frall");
		misCantantes.add("Grall Grealll");
		//recorridos
		System.out.println("\nRecorrido bucle for normal");
		for(int i=0; i<misCantantes.size();i++) {
			System.out.println(i + " " + misCantantes.get(i));
		}
		System.out.println("\nRecorrido for each");
		for(Object o:misCantantes) {
			System.out.println(o);
		}
		System.out.println("\nRecorrido iterator");
		Iterator it=misCantantes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(int i=1; i<3;i++) {
			System.out.println("añade un cantante: ");
			misCantantes.add(teclado.nextLine());
		}
		System.out.println("\nNuevo lista arrayList");
		it=misCantantes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//limpiar ArrayList
		/*misCantantes.clear();
		it=misCantantes.iterator();
		System.out.println("nuevo recorrido");
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		System.out.println("\nIntroduce un cantante: ");
		if(misCantantes.contains(teclado.nextLine()))
			System.out.println("Esta en la lista!");
		else
			System.out.println("No esta en la lista!");
	}

}
