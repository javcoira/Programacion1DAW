package capitulo9;

public class testNombres {

	public static void main(String[] args) {
		int posicion=2;
		ExamNombres listaNombres = new ExamNombres(5);
		listaNombres.insertar("pepe");
		listaNombres.insertar("maria");
		listaNombres.insertar("pepe");
		listaNombres.insertar("paco");
		listaNombres.insertar("juan");
		listaNombres.insertar("unai");
		listaNombres.mostrarTodaLista();
		System.out.println("Nombre de la posicion " + posicion + " " + listaNombres.mostrar(posicion));
		posicion = 7;
		System.out.println("Nombre de la posicion " + posicion + " " + listaNombres.mostrar(posicion));
		System.out.println("Total de nombres " + listaNombres.numNombres());
		System.out.println("El numero maximo que puede terner la lista es: " + listaNombres.maxNombres());
		System.out.println("La lista esta llena " + listaNombres.estaLlena());
		
		if(listaNombres.eliminar("paco"))
			System.out.println("Elimiado");
		else
			System.out.println("No estaba en la lista");
		
		listaNombres.insertar("carlos");
	}
}
