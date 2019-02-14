package ejercicioPractica;

public class Estudiante extends Personal{

	private String curso;

	public Estudiante(String nombre, String apellido, String DNI, Estado estadoCivil, String curso) {
		super(nombre,apellido,DNI,estadoCivil);
		this.curso = curso;
	}
	
	public void matriculaEstudiante(String curso) {
		this.curso=curso;
	}

	@Override
	public String imprimirInfoTotal() {
		return super.imprimirInfoTotal() + " -> Estudiante [curso=" + curso + "]";
	}
}
