package adicional;

public class Libro extends Obra{
	private int numPag;
	
	public Libro(String titulo, String autor, int numPag) {
		super(titulo, autor);
		this.numPag = numPag;
		System.out.println("Constructor de Libro");
	}
	
	public Libro(String titulo, int numPag) {
		super(titulo);
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro [numPag=" + numPag + "]";
	}
	
}
