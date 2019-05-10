package excepciones.alumno;

public class invalidEdad extends Exception{
	public invalidEdad(String mensaje) {
		//reescribir el mensaje del padre por defecto
		super(mensaje);
	}
}
