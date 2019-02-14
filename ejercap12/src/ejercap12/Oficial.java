package ejercap12;

public class Oficial extends Operario{
	public Oficial (String nombre){
	super(nombre);
	System.out.println("constriuctor de Oficial");
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial ";
	}
	
	
}
