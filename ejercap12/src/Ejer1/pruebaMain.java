package Ejer1;

import java.util.ArrayList;
import java.util.Iterator;

public class pruebaMain {

	public static void main(String[] args) {
		/* Crea una clase aparte con el método main que rellene un arrayList de empleados, pudiéndose cargar programadores. */

		ArrayList <Empleado> emp = new ArrayList();
		String[] nombres = new String[] {"PHP","Python","Haskell"};
		String[] lens = {"Ada","C++"};
		
		emp.add(new Programador("Alex","454353455","Java","C","JavaScript"));
		emp.add(new Empleado("Juan", "423423432"));
		emp.add(new Programador("Pepe","34234"));
		emp.add(new Programador("Pedro","34343234",nombres));
		
		Iterator it = emp.iterator();
		while(it.hasNext()) {
			Empleado e = (Empleado) it.next();
			System.out.println(e.toString());
		}
	
		System.out.println();
		
		it = emp.iterator();
		while(it.hasNext()) {
			Empleado e = (Empleado) it.next();
			if(e instanceof Programador ) {
				Programador p = (Programador) e;
				p.setLenguajes(lens);
				System.out.println(e.toString());
			}
		}
		
	}
}
