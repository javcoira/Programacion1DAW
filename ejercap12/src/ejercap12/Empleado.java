package ejercap12;

public class Empleado {
	private String nombre;
	public Empleado (String nombre) {
		this.nombre=nombre;
		System.out.println("Constructor del empleado "+nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return " [nombre = "+nombre+"] -> Empleado ";
	}
}
