package adicional;

public class Cuadro extends Obra{
	private int ancho;
	private int alto;
	
	public Cuadro(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		System.out.println("constructor de Cuadro");
	}
	
	public Cuadro(String titulo, int ancho, int alto) {
		super(titulo);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Cuadro(String titulo, String autor, int ancho, int alto) {
		super(titulo, autor);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public String toString() {
		return super.toString() + "Cuadro [ancho = " + ancho + "alto = " + alto + "]";
	}
}
