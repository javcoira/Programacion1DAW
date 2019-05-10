package gatoSort;

public class Gato implements Comparable <Gato>{
	private String nombre, amo;
	private int edad;
	public Gato(String nombre, String amo, int edad) {

		this.nombre = nombre;
		this.amo = amo;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getAmo() {
		return amo;
	}
	public int getEdad() {
		return edad;
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", amo=" + amo + ", edad=" + edad + "]";
	}
	
	//comparamos por lo que queremos segun las propiedades
	public int compareTo(Gato g) {
		return (this.amo.compareTo(g.getAmo()));
	}
	
}
