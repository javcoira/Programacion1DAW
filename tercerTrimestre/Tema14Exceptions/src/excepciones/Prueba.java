package excepciones;

public class Prueba {

	// Generate an exception.
	static void generaException() {
		int nums[] = new int[4];
		System.out.println("Antes de ser generada");
		// generate an index out-of-bounds exception
		try {
			nums[7] = 10;
			System.out.println("Este mensaje no se emitirá");
		} catch (ArithmeticException exc) { //esta excepcion no es la adecuada por lo que el error tendria que pasar arriba y ser tratado
			//por Ejemplo2
			// catch the exception
			System.out.println("Se propaga al nivel superior");
		}
		finally {
			System.out.println("si o si");
		}

	}
}
