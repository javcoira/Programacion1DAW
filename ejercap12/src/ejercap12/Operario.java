package ejercap12;

public class Operario extends Empleado {
	 public Operario (String nombre) {
		 super(nombre);
		 System.out.println("constructor de Operario");
	 }
	public String toString() {
		return super.toString()+" -> Es operario";
	}

}
