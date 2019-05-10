package excepciones;

public class GeneradoCatchPrueba {

	public static void main(String[] args) {
		try {
			GeneradoCatch.democatch();
		} catch(NullPointerException ex) {
			System.out.println("capturada de nuevo en el main " + ex);
		}

	}

}
