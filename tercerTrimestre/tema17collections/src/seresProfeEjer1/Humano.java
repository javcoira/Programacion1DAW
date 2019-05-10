package seresProfeEjer1;

public class Humano extends SerVivo{
	private String nombre;

	public Humano( byte edad,String nombre) {
		super(edad);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + super.toString() + "] ";
	}
 
	public boolean equals(Humano otro) {
		if(super.equals(otro)) {
			if(this.getNombre().compareTo(otro.getNombre()) == 0) {
				return true;
			}
		}
		return false;
		
		// if(this.nombre.equals(otro.getNombre()) && this.getEdad() == otro.getEdad()) return true);
		// if(this.nombre.equals(otro.getNombre()) && super.equals(otro)) return true);
	}
	
	public Humano mayor(Humano otro) {
		if(this.nombre.length() > otro.getNombre().length() && this.getEdad() > otro.getEdad()) {
			return this;
		}
		return otro;
	}
}
