package ejerciciosMio.serializable;

import ejercicioProfe.serializable.Persona;

public class Empleado extends Persona{
	double sueldo;
	
	public Empleado(String nif, String nombre, int edad, double sueldo) {
		super(nif, nombre, edad);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [sueldo=" + sueldo + "]";
	}
	
}
