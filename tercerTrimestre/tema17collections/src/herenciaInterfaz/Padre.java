package herenciaInterfaz;

public class Padre implements Operaciones{
 private String nombre;
 private int edad;
 
public Padre(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public Padre mayor(Padre otro) {
	if(this.edad>otro.getEdad())
		return this;
	return otro;
}

@Override
public String toString() {
	return "Padre [nombre = " + nombre + ", edad = " + edad + "]";
}
 
}
