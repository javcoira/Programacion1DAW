package capitulo9;

public class Empleado {
	private String nombre;
	private String telefono;
	private static int numEmpleado=0;
	
	public Empleado(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		numEmpleado++;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static int getNumEmpleados(){
		return numEmpleado;
	}
	@Override
	public String toString() {
		return "Empleado [nombre = " + nombre + ", telefono = " + telefono + "]";
	}
	
}
