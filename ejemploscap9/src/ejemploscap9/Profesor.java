package ejemploscap9;

/*Define una clase Profesor considerando los siguientes atributos de clase: nombre (String), apellidos (String),
 *  edad (int),  especialista (boolean). Define un constructor que reciba los parámetros necesarios para la 
 *  inicialización y otro constructor que no reciba parámetros. El nombre de los parámetros debe ser el mismo 
 *  que el de los atributos y usar this para asignar los parámetros recibidos a los campos del objeto. 
 *  Crea los métodos para poder establecer y obtener los valores de los atributos, con sobrecarga de nombres y uso 
 *  de this en los métodos setters (los que sirven para establecer el valor de los atributos). Compila el código 
 *  para comprobar que no presenta errores, crea un objeto usando el constructor con sobrecarga. 
 *  Comprueba que se inicializa correctamente consultando el valor de sus atributos después de haber creado el objeto. 
 *  Usa los métodos setters y comprueba que funcionen correctamente.
*/

public class Profesor {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean especialista;
	
	public Profesor(){
		
	}
	
	public Profesor(String nombre, String apellidos, int edad, boolean especialista){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.especialista = especialista;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellidos(){
		return this.apellidos;
	}
	
	public int getEdad(){
		return this.edad;
	}
	
	public boolean getEspecialista(){
		return this.especialista;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void setEspecialista(boolean especialista){
		this.especialista = especialista;
	}

	@Override
	public String toString() {
		return "Profesor [nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad + ", especialista = "
				+ especialista + "]";
	}
}
