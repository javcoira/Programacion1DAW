package capitulo9;

public class Persona {
	private String id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String nacionalidad;
	
	/*persona con 2 apellidos y dni*/
	Persona(String nombre, String apellido1, String apellido2, String id, int edad, String nacionalidad){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.id = id;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}
	
	Persona(String nombre, String apellido1, String id, int edad, String nacionalidad){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.id = id;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}

	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getApellido1(){
		return this.apellido1;
	}
	
	public void setApellido1(String apellido1){
		this.apellido1 = apellido1;
	}
	
	public String getApellido2(){
		return this.apellido2;
	}
	
	public void setApellido2(String apellido2){
		this.apellido2 = apellido2;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String getNacionalidad(){
		return this.nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad){
		this.nacionalidad = nacionalidad;
	}
	
	@Override
	public String toString() {
		return "Persona [id = " + id + ", nombre = " + nombre + ", apellido1 = " + apellido1 + ", apellido2 = " + apellido2
				+ ", edad = " + edad + ", nacionalidad = " + nacionalidad + "]";
	}
	
}
