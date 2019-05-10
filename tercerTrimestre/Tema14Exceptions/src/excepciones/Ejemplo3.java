package excepciones;

public class Ejemplo3 {

	public static void main(String[] args) {
		int numerador[] = {4, 8, 16, 32, 64, 128, 256, 512}; //Longitud 8
        int denominador[] = {2, 0, 4, 4, 0, 8}; //Longitud 6
        for (int i = 0; i < numerador.length; i++) {
            try {
                System.out.println(numerador[i] + " / " + denominador[i] + " is " + numerador[i] / denominador[i]);
            } catch (ArithmeticException exc) {
                System.out.println(numerador[i] + " / " + denominador[i] );
                System.out.println("No se puede dividir por cero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No existe la celda "+ i + " en denominador.");
            }
        }
    }
}
