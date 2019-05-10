package serHumano.ejer3Lista;

public class Robot implements Comparable<Robot>{
	
	private String ID;
	private double porcentaje;
	
	public Robot(String iD, double porcentaje) {
		ID = iD;
		this.porcentaje = porcentaje;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	@Override
	public String toString() {
		return "Robot [ " + ID + ", porc = " + porcentaje + " ]";
	}
	@Override
	public int compareTo(Robot o) {
		int res=2;
		
		if(this.porcentaje<o.porcentaje) {
			res = -1;
		}else if(this.porcentaje>o.porcentaje) {
			res=1;
		}else if(this.porcentaje==o.porcentaje) {
			res=0;
		}
		
		return res;
	}
	
	
}
