package formas2;
import formas1.*;

public class Nueva {
	
	Nueva(){
		
	}
	
	public void prueba3() {
		Curvas c = new Curvas(4,78);
		
	//	c.curva0();						// no porque es privado
	//	c.curva1();						// no porque es protegido
	//	c.curva2();						// no porque es por defecto
		c.curva3();						// si porque la otra es publica
		
	}
}
