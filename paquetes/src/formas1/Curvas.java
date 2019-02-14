package formas1;

public class Curvas {
	private int centrox;
	private int centroy;
	
	public Curvas(int x, int y) {
		System.out.println("soy una curva");
		this.centrox=x;
		this.centroy=y;
	}
	
	private void curva0() {
		System.out.println("comienzo en " + centrox +  " " + centroy);
	}
	protected void curva1() {
		System.out.println("comienzo en " + (centrox + 1) +  " " + centroy);
	}
	void curva2() {
		System.out.println("comienzo en " + (centrox + 2) +  " " + centroy);
	}
	public void curva3() {
		System.out.println("comienzo en " + (centrox + 3) +  " " + centroy);
	}
	
	public void acceso() {
		curva0();
		curva1();
		curva2();
		curva3();
	}
	
}

