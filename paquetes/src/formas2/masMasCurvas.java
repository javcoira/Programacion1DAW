package formas2;
import formas1.Curvas;

public class masMasCurvas extends Curvas {
	
	masMasCurvas(int centrox, int centroy){
		super(centrox,centroy);
	}
	
	public void prueba2() {
		//curva0();				//INVISIBLE POR PRIVADO
		curva1();
		//curva2();				// INVISIBLE POR DEFECTO AL CREAR METODO NO SE ESPECIFICO EL TIPO
		curva3();
	}
}
