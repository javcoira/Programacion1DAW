package examen;

public class ejer7 {

	public static void imprime(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int valmin = 0, valmax = 135;
		int puntuacion[] = new int[30];
		int frecuencia[] = new int[valmax + 1];
		int puntuamax = 0, frecuenciamax = 0, pos = 0, puntuamin = 135;
		double promedio=0;
		for (int i = 0; i < puntuacion.length; i++) {
			puntuacion[i] = (int) (Math.random() * (valmax - valmin + 1) + valmin);
			frecuencia[puntuacion[i]]++;
			promedio += puntuacion[i];
			// aux=puntuacion[i];frecuencia[aux]++;
			// frecuencia[puntuacion[i]]++;
			if (puntuacion[i] > puntuamax) {
				puntuamax = puntuacion[i];
			}
			if (puntuacion[i] < puntuamin) {
				puntuamin = puntuacion[i];
			}	
		}
		for(int i=0;i<frecuencia.length;i++){
			if (frecuencia[i] > frecuenciamax) {
				frecuenciamax = frecuencia[i];
				pos = i;
			}
		}
		imprime(puntuacion);
		imprime(frecuencia);
		promedio /= puntuacion.length;
		System.out.println("la puntuacion mas alta es " + puntuamax);
		System.out.println("la puntuacion mas baja es " + puntuamin);
		System.out.println("la puntuacion promedio es " + promedio);
		System.out.println("el valor mas repetido es " + pos);
	}

}
