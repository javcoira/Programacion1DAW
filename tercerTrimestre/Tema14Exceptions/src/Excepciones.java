
public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[4];
		try {
			System.out.println("Antes de que se genere la exception");
			numeros[7]=3;
			System.out.println("Este mensaje no se emitura");
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out of bounds!");
		}
		
		System.out.println("Mensaje posterior al catch");
	}

}
