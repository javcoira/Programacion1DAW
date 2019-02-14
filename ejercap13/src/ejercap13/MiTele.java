package ejercap13;

public class MiTele implements Televisor{

	private int numCanales;
	private int canalActual;
	private boolean encendida;
	
	public MiTele(int numCanales, int canalActual, boolean encendida) {
		this.numCanales = numCanales;
		this.canalActual = canalActual;
		this.encendida  = encendida;
	}
	
	public void encender() {
		if(!this.encendida)
			this.encendida = true;
	}
	
	public void apagar() {
		if(this.encendida)
			this.encendida = false;
	}
	
	public void cambiarCanal(int canal) {
		if(canal>1 && canal<=this.numCanales)
			this.canalActual = canal;
		else
			System.out.println("el canal no existe");
	}

	@Override
	public String toString() {
		return "MiTele [numCanales=" + numCanales + ", canalActual=" + canalActual + ", encendida=" + encendida + "]";
	}
}
