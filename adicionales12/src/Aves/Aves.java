package Aves;

public abstract class Aves {

		private String nombreVulgar;
		private String nombreCientifico;
		int numeroIndividuos;
		
	    public Aves(String nombreVulgar, String nombreCientifico, int numeroIndividuos) { 
	    	this.nombreVulgar = nombreVulgar;
	    	this.nombreCientifico = nombreCientifico;
	    	this.numeroIndividuos = numeroIndividuos;
	    } //Constructor

	   public void incrementarNumeroIndividuos(int n){
	    	if(n>0)
	    		this.numeroIndividuos+=n;
	    }// Incrementar el valor de numeroIndividuos en n individuos
	    	
	    public void decrementarNumeroIndividuos(int n){
	    	if(n>0)
	    		this.numeroIndividuos-=n;
	    } // Decrementa el valor de numeroIndividuos en n individuos

	    public String getNombreVulgar() {
			return nombreVulgar;
		}

		public void setNombreVulgar(String nombreVulgar) {
			this.nombreVulgar = nombreVulgar;
		}

		public String getNombreCientifico() {
			return nombreCientifico;
		}

		public void setNombreCientifico(String nombreCientifico) {
			this.nombreCientifico = nombreCientifico;
		}

		public int getNumeroIndividuos() {
			return numeroIndividuos;
		}

		public void setNumeroIndividuos(int numeroIndividuos) {
			this.numeroIndividuos = numeroIndividuos;
		}

		public boolean peligroExtinción(){ 
	    	if(this.numeroIndividuos<=100)
	    		return true;
	    	else
	    		return false;
	    	// return this.numIndividuos<100		forma compacta
	    } //Devuelve true si numeroIndividuos es menor a 100

		@Override
		public String toString() {
			return "Aves [nombreVulgar = " + nombreVulgar + ", nombreCientifico = " + nombreCientifico
					+ ", numeroIndividuos = " + numeroIndividuos + " ] ";
		}

}
