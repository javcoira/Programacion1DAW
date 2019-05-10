package excepciones.repaso;

public class Prueba1 {

	public static void main(String[] args) {
		
		int a=4,b=0;
		try {
			System.out.println(a/b);
			System.out.println("fin del programa");
		}
		catch (ArithmeticException ex) {
			System.out.println("intento de division por 0 " + ex);
		}
		finally {
			System.out.println("fin del programa");
		}

	}

}
