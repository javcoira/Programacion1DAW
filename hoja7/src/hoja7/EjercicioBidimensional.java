package hoja7;

public class EjercicioBidimensional {

	
	public static int positivos(int tabla[][]){
		int totalPos=0;
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				if(tabla[i][j]>0)
					totalPos++;
			}
		}
		
		return totalPos;
	}
	
	public static void mostrar(int tabla[][]){
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				System.out.print(tabla[i][j] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
	int tabla[][] = new int[3][4];
	int max=100, min=-100;
	for(int i=0;i<tabla.length;i++){
		for(int j=0;j<tabla[i].length;j++){
			tabla[i][j]=(int)(Math.random()*(max-min+1)+min);
		}
	}
	mostrar(tabla);
	System.out.println("\nTotal positivos " + positivos(tabla));
	
	}

}
