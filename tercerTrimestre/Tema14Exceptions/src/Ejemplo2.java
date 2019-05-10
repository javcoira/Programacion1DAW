// ver prueba y el mensaje que no se emitira

public class Ejemplo2 {
	public static void main(String...  args) {
		/*try {
			Prueba.generaException();
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("mensaje index out of bounds");
		}
		System.out.println("Mensaje posterior al catch");
		*/
		try {
			Prueba.generaException2();
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("mensaje index out of bounds, error propagado de el metodo de que se llama, este no tiene un catch de este error y va"
					+ "al padre a ver si tiene un control de este error");
		}finally {
			System.out.println("mensaje que se muestra si o si");
		}
		System.out.println("Mensaje posterior al catch");
	}
}
