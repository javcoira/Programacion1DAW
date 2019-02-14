package ejercap12;

public class Tecnico extends Operario {

	public Tecnico (String nombre){
	super(nombre);
	System.out.println("constriuctor de Tecnico");
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico ";
	}
	
	
}
