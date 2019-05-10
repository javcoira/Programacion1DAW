package excepciones;

public class PruebaThrows1 {

	public static void main(String[] args) {
		try {
			Throws1.demothrows();
		} catch (IllegalAccessException e) {
			System.out.println("capturada IllegalAccessException en main");
		} catch (TypeNotPresentException e) {
			System.out.println("capturada TypeNotPresentException en main");
		}
	}

}
