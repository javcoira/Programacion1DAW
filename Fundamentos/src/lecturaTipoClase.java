import java.util.Scanner;

public class lecturaTipoClase {

	public static void main(String[] args) throws java.io.IOException {
		double num1 = 0;
		char ch; 
		boolean valorBoolean;
		
		/*System.out.print("Press a key followed by ENTER: "); 
		ch = (char) System.in.read(); // get a char 
		System.out.println("Your key is: " + ch);*/

		Scanner Scanner = new Scanner(System.in);
		
		/*System.out.println("Ingresa el primer valor: ");
		num1 = Scanner.nextDouble();
		System.out.println("Su valor es: " + num1);*/

		System.out.println("type true or false: ");
		valorBoolean = Scanner.nextBoolean();
		System.out.println("El valor que has introducido es: " + valorBoolean);
		System.out.println("su contrario es: " + !valorBoolean);
	}
}

