package cambioExamNombresToArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExamNombres {
	private  ArrayList<String> datos;
	private int maximo; // numero maximo de elemento de tipo string de datos

	
	//ojo a como crea el this.datos, no recibe el ArrayList sino lo crea en el contructor
	//constructor
	ExamNombres(int maximo){
		this.datos = new ArrayList();
		this.maximo = maximo;

	}
	
	//quitamos la variable actual 
	public int numElementos() {
		return datos.size();
	}
	
	//ojo a los metodos public static void que si lo ponemos no me deja datos.iterator()
	//public void mostrarTodaLista()
	public void mostrarTodaLista() {
		Iterator it = this.datos.iterator();
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}
	}
	
	//public void insertar (String nuevoNombre)
	public  void insertar(String nuevoNombre) {
		if(numElementos()<maximo) {
			this.datos.add(nuevoNombre);
		}else {
			System.out.println("no, lista llena");
		}
	}
	
	//metodo eliminar
	public boolean eliminar(String nom) {
		boolean resul;
		resul = this.datos.remove(nom);
		return resul;
	}
	
	public void limpiar() {
		System.out.println("limpiamos la lista");
		this.datos.clear();
	}
	
}
