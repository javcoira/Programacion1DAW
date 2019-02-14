package ejercap12;

public class Directivo extends Empleado {

	 public Directivo (String nombre) {
		 super(nombre);
		 System.out.println("constructor de directivo");
	 }
	public String toString() {
		return super.toString()+" -> Es directivo";
	}
}
