package ejercicioPractica;

public abstract class Personal {

	private String nombre;
	private String apellido;
	private String DNI;
	private Estado estadoCivil;
	
	public Personal(String nombre, String apellido, String DNI, Estado estadoCivil) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=DNI;
		this.estadoCivil=estadoCivil;
	}
	
	public void cambioEstadoCivil(Estado nuevoEstado) {
		this.estadoCivil=nuevoEstado;
	}

	public String imprimirInfoTotal() {
		return "Personal [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", estadoCivil=" + estadoCivil
				+ "]";
	}
	
		
}
