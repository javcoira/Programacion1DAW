package formas1;

public class masCurvas {
	private int pendiente;
	
	masCurvas(int pendiente){
		this.pendiente=pendiente;
	}
	
	public void prueva() {
		Curvas c1=new Curvas(2,3);
		c1.curva1();
		c1.curva2();
		c1.curva3();
	}
}
