
public class ejerci_hoja4_ordenacion {

	public static int[] crearAleatorios(int num){
		int array[] = new int[num];
		for(int i=0;i<array.length;i++){
			array[i] = (int)(Math.random()*100+1);
		}
		return array;
	}
	
	public static void mostrarArray(int arr[]){
		for(int i : arr){
			System.out.print(" " + i);
		}
	}
	
	public static void ordenarAsc(int arr[]) {

		int intercambio, tam = arr.length;
		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; j++) {
				if (arr[i] > arr[j]) {
					intercambio = arr[j];
					arr[j] = arr[i];
					arr[i] = intercambio;
				}
			}
		}
	}

	public static void main(String[] args){

		int numeros[] = crearAleatorios(10);
		System.out.println("numeros del array: ");
		mostrarArray(numeros);
		ordenarAsc(numeros);
		
		System.out.println("\nLista ordenada: ");
		mostrarArray(numeros);
		
	
	}
}