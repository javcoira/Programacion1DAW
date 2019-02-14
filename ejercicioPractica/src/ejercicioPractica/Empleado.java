package ejercicioPractica;

public abstract class Empleado extends Personal{

	private int anioIncorporacion;
	private int numDespacho;
	
	public Empleado(String nombre, String apellido, String DNI, Estado estadoCivil,int anioIncorporacion, int numDespacho) {
		super(nombre, apellido, DNI, estadoCivil);
		this.anioIncorporacion=anioIncorporacion;
		this.numDespacho=numDespacho;
	}
	
	public void reasignarDespacho(int despacho) {
		this.numDespacho=despacho;
	}

	@Override
	public String imprimirInfoTotal() {
		return  super.imprimirInfoTotal() + " -> Empleado [anioIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + "]";
	}

}
