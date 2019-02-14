package ejercicioPractica;

public class Profesor extends Empleado {
	
	private String departamento;
	
	public Profesor(String nombre, String apellido, String DNI, Estado estadoCivil, int anioIncorporacion,
			int numDespacho, String departamento) {
		super(nombre, apellido, DNI, estadoCivil, anioIncorporacion, numDespacho);
		this.departamento=departamento;
	}
	
	public void cambioDepartamento(String departamento) {
		this.departamento=departamento;
	}

	@Override
	public String imprimirInfoTotal() {
		return super.imprimirInfoTotal() + " -> Profesor [departamento=" + departamento + "]";
	}
	
	
	
}
