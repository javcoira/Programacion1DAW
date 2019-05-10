package seresProfeEjer1;

public class SerVivo implements IOperaciones{

	private byte edad;
	
	public SerVivo(byte edad) {
		this.edad = edad;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return " Este SerVivo [edad=" + edad + "] ";
	}

	public SerVivo mayor(SerVivo otro) {
		if(this.edad > otro.getEdad()) {
			return this;
			//this.edad < otro.edad
		}else
			return otro;
	}
	
	public boolean equals(SerVivo otro) {
		if(this.edad == otro.getEdad()) {
			return true;
		}
		return false;
	}

}
