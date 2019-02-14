import java.util.Scanner;

public class truenov2 {

	public static void main(String[] args) {
		String numString, multiploString;
		int numConvertido = 0, multiploConvertido = 0;
		
		Scanner scanner = new Scanner(System.in);

		//Pedimos el valor del numero y del multiplo a buscar
		System.out.println("Ingresa el valor: ");
		numString = scanner.nextLine();
		numConvertido = Integer.parseInt(numString);
		
		System.out.println("Ingresa el multiplo a comprobar: ");
		multiploString = scanner.nextLine();
		multiploConvertido = Integer.parseInt(multiploString);
		
		if(numConvertido % multiploConvertido == 0){
			System.out.println("El numero "+ numConvertido + " es multiplo de " + multiploConvertido);
		}
		else{
			System.out.println("El numero "+ numConvertido + " no es multiplo de " + multiploConvertido);

		}
	}
}
