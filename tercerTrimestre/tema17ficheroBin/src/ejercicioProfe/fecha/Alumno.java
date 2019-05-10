package ejercicioProfe.fecha;

public class Alumno extends Persona {
	private Fecha fechaMat;
	
	public Alumno(String nif,String nombre, int edad, Fecha fechaMat) {
		super(nif,nombre,edad);
		this.fechaMat = new Fecha();
		setFechaMatricula(fechaMat);
	}
	
	public void setFechaMatricula(Fecha fechaMat) {
		this.fechaMat.setDia(fechaMat.getDia());
		this.fechaMat.setMes(fechaMat.getMes());
		this.fechaMat.setAnio(fechaMat.getAnio());
	}
	
	public Fecha getFecha() {
		return fechaMat;
	}

	@Override
	public String toString() {
		return "Alumno [fechaMat=" + fechaMat + "]" + super.toString();
	}

}
