package herenciaInterfaz;

public class Hijo extends Padre{
 private double altura;

public Hijo(String nombre, int edad,double altura) {
	super(nombre,edad);
	this.altura = altura;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

//ojo que se puede reescribir la interfaz para que ahora reciba un Hijo en lugar de padre

public Padre mayor(Hijo otro) {
	Padre p;
	if(this.altura>otro.getAltura())
		p = this;
	else
		if(this.altura==otro.getAltura()) {
			//compara la edad llamando a la funcion mayor del padre
			if(super.mayor(otro).equals(otro))
				p=otro;
			else
				p=this;
		}else
			p=otro;
	return p;
}

@Override
public String toString() {
	return super.toString() + "-> Hijo [altura = " + altura + "]";
}


 
 
}
