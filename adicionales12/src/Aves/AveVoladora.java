package Aves;

public class AveVoladora  extends Aves{
	
	private String tipoAve;
	
	public AveVoladora(String nombreVulgar, String nombreCientifico, int numeroIndividuos,String tipoAve) {
		super(nombreVulgar, nombreCientifico, numeroIndividuos);
		this.tipoAve=tipoAve;
	}

	public String getTipoAve() {
		return tipoAve;
	}

	public void setTipoAve(String tipoAve) {
		this.tipoAve = tipoAve;
	}

	@Override
	public String toString() {
		return  " AveVoladora { " + super.toString() + " [ tipoAve = " + tipoAve + " ]";
	}
	
}
