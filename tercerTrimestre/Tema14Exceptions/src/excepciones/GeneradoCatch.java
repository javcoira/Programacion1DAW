package excepciones;
//clase que nos genere error en su zona catch
public class GeneradoCatch {

	static void democatch() {
		try {
			throw new NullPointerException();
		} catch(NullPointerException e) {
			System.out.println("captura excepcion en bloque catch de democatch");
			throw e;//volvemos a provocar otra excepcion que ya no es tratada aqui
			//se propaga al siguiente nivel
		}
	}
}
