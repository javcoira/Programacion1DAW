import java.util.Scanner;

public class hoja4_bubblesort {

	public static void mostrar(int vector[]) {
		System.out.println("array impresion: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.println(" " + vector[i]);
		}
		System.out.println();
	}

	public static int[] crearArray(int numElem, int maximo) {
		int nums[] = new int[numElem];
		
		for (int i = 0; i < numElem; i++) {
			nums[i] = (int) (Math.random() * maximo + 1);
		}
		return nums;
	}
	
	public static int[] numerosArray(){
		int cuantos,maxi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("De cuantos elementos quieres el array: ");
		cuantos = sc.nextInt();
		System.out.println("Dime el valor maximo: ");
		maxi = sc.nextInt();
		int nums[] = crearArray(cuantos,maxi);
		
		return nums;
	}
	
	public static void main(String[] args) {

		//int nums[] = crearArray(44);
		//int nums[] = new int[44];
		//nums = crearArray(numElem,maximo);
		int a, b, t;
		int size, cuantos, maxi;
		int nums[] = numerosArray();
		size = nums.length; // número de elementos que hay que ordenar
		System.out.print("Original array is:");
		mostrar(nums);
		System.out.println();
		// Algoritmo de la burbuja ordenacion descendente.
		for (a = 0; a < size - 1; a++) {
			for (b = a + 1; b < size; b++) {
				if (nums[a] < nums[b]) {
					t = nums[b];
					nums[b] = nums[a];
					nums[a] = t;
				}
			}
		}
		System.out.print("Sorted array is:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();
	}
}
