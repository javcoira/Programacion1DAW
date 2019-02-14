package ejercicioPractica;

public class PersonalServicio extends Empleado{

	private String seccion;
	
	public PersonalServicio(String nombre, String apellido, String DNI, Estado estadoCivil, int anioIncorporacion,
			int numDespacho, String seccion) {
		super(nombre, apellido, DNI, estadoCivil, anioIncorporacion, numDespacho);
		this.seccion=seccion;
	}
	
	public void trasladoSeccion(String nuevaSeccion) {
		this.seccion=nuevaSeccion;
	}

	@Override
	public String imprimirInfoTotal() {
		return super.imprimirInfoTotal() + " -> PersonalServicio [seccion=" + seccion + "]";
	}
	
	
}
