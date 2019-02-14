package formas1;

public class Parabola extends Curvas {
	private int grado;
	
	public Parabola(int centrox, int centroy, int grado) {
		super(centrox,centroy);
		this.grado=grado;
		System.out.println("soy una parabola de grado " + this.grado);
	}
	
	public void prueba() {
	//	curva0(); 					NO SE PUEDE ACCEDER YA QUE ES PRIVATE SOLO CON GETTER Y SETTER
		curva1();
		curva2();
		curva3();
	}
	
	
}
