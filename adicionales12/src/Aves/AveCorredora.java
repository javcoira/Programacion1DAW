package Aves;

public class AveCorredora extends Aves {

private int velMax;
	
	public AveCorredora(String nombreVulgar, String nombreCientifico, int numeroIndividuos,int velMax) {
		super(nombreVulgar, nombreCientifico, numeroIndividuos);
		this.velMax=velMax;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	@Override
	public String toString() {
		return  " AveCorredora { " + super.toString() + " [ velocidaMax = " + velMax + " ]";
	}
	
}
