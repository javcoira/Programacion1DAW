import java.rmi.AccessException;

public class Prueba {
	static void generaException() {
		int nums[]= new int[4];
		System.out.println("Antes de ser generada");
		nums[7]=10;
		System.out.println("Este mensaje no se emitira");
	}
	
	//en esta la excepcion de esta clase no tiene efecto por lo que es pasada al a calse de arriba que si la tiene controlada con el indexoutofbounds
	static void generaException2() {
		int nums[]= new int[4];
		System.out.println("Antes de ser generada");
		try {
			nums[7]=10;
			System.out.println("Este mensaje no se emitira");
		}catch(ArithmeticException exc) {
			System.out.println("se propaga");
		}finally {
			System.out.println("muestra por defecto, si pasa el try sin errores, lo muestra, o si entra al catch muestra el"
					+ " error y luego eso, y tambien si falla sin encontrar un catch muestra esto y para");
		}
		System.out.println("mensaje posterior al catch");
	}
}
