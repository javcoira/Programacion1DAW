package excepciones.alumno;

public class Alumno {
	private String nombre;
	private int edad;
	private double nota;
	
	public Alumno(String nombre, int edad) {
		this.nombre=nombre;
		try {
			if(edad<10) throw new invalidEdad("menor de la edad permitida");
			this.edad=edad;
		}catch(invalidEdad ex) {
			System.out.println(ex);
			this.edad=10;
		}
	}
	
	public void setNota(double nota) {
		try {
			if(nota<0 || nota>10) throw new invalidNota("nota fuera de rango");
			this.nota=nota;
		}catch(invalidNota ex) {
			System.out.println(ex);
			this.nota=0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}
	
	
	
}
