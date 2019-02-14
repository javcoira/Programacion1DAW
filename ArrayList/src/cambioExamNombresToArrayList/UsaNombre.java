package cambioExamNombresToArrayList;


public class UsaNombre {

	public static void main(String[] args) {
		ExamNombres listaNombres = new ExamNombres(5);
		listaNombres.insertar("pepe");
		listaNombres.insertar("pepe");
		listaNombres.insertar("eve");
		listaNombres.insertar("pepe");
		//elimina el primer pepe que encuantre
		listaNombres.eliminar("pepe");
		listaNombres.insertar("eve");
		listaNombres.insertar("juan");
		listaNombres.insertar("juan");
		listaNombres.mostrarTodaLista();
		listaNombres.limpiar();
		listaNombres.mostrarTodaLista();

	}

}
