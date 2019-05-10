package excepciones.alumno;

public class invalidNota extends Exception{
	public invalidNota(String mensaje) {
		//reescribir el mensaje del padre por defecto
		super(mensaje);
	}
}
