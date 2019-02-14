package capitulo9;

public class Vehiculo {
	private int numRuedas;
	private int velMax;
	private int peso;
	
	Vehiculo(int numRuedas, int velMax, int peso){
		this.numRuedas = numRuedas;
		this.velMax = velMax;
		this.peso = peso;
	}
	
	Vehiculo(){

	}
	
	public int getNumRuedas(){
		return this.numRuedas;
	}
	
	public int getVelMax(){
		return this.velMax;
	}
	
	public int getPeso(){
		return this.peso;
	}
	
	public void setNumRuedas(int numRuedas){
		this.numRuedas = numRuedas;
	}
	
	public void setVelMax(int velMax){
		this.velMax = velMax;
	}
	
	public void setPeso(int peso){
		this.peso = peso;
	}
	
	public void informe(){
		System.out.println("El vehiculo tiene " + this.numRuedas + " ruedas, su velocidad maxima es "
				+ this.velMax + "km/h y su peso es " + this.peso + " kilos");
	}
	
	public boolean esIgual(Vehiculo otroVehiculo){
		//boolean sol=false;
		if(this.numRuedas == otroVehiculo.getNumRuedas() && this.velMax == otroVehiculo.getVelMax() 
				&& this.peso == otroVehiculo.getPeso()){
			//sol = true;
			return true;
		}else
			return false;
		//return sol;
	}
	
	public void copia(Vehiculo otroVehiculo){
		otroVehiculo.setNumRuedas(this.numRuedas);
		otroVehiculo.setVelMax(this.velMax);
		otroVehiculo.setPeso(this.peso);
	}
	
	public void copia2(Vehiculo otroVehiculo){
		this.numRuedas = otroVehiculo.getNumRuedas();
		this.velMax = otroVehiculo.getVelMax();
		this.peso = otroVehiculo.getPeso();
	}
	
}
