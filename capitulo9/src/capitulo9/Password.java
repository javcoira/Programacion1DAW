package capitulo9;

public class Password {

	private int longitud;
	private String clave;
	
	Password(){
		this.longitud = 8;
		generaPassword();
	}
	Password(int longitud){
		this.longitud = longitud;
		generaPassword();
	}
	
	public int getLongitud() {
		return longitud;
	}

	public String getClave() {
		return clave;
	}

	public void generaPassword(){
		String Pass="";
		char numeros;
		char minus;
		char mayus;
		for(int i=0;i<this.longitud;i++){
			int eleccion = (int) (Math.random()*1001);
			if(eleccion%2==0){ //entre 48 y 57 numero par , numeros tabla unicode 
				numeros = (char) (int) (Math.random()*(58-48)+48);
				Pass+=numeros;
			}else{
				if(eleccion%3==0){ //minuscula entre 97 y 122 impar multiplo de 3
					minus = (char) (int) (Math.random()*(123-97)+97);
					Pass+=minus;
				}else{ //65 al 90 caso en el sea impar y no sea multiplo de 3
					mayus = (char) (int) (Math.random()*(91-65)+65);
					Pass+=mayus;
				}
			}
		}
		this.clave = Pass;
	}
	
	public boolean esFuerte(){
		int minus = 0, mayus = 0, numeros = 0;
		for (int i = 0; i < this.clave.length(); i++) {
			if (this.clave.charAt(i) >= 97 && this.clave.charAt(i) <= 122) {
				minus++;
			} else {
				if (this.clave.charAt(i) >= 65 && this.clave.charAt(i) <= 90) {
					mayus++;
				} else {
					numeros++;
				}
			}
		}
		if (numeros >= 5 && mayus >= 2 && minus >= 1) {
			return true;
		} else {
			return false;
		}
	}
}
