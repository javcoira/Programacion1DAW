package hoja7;

import java.util.Scanner;

public class adl3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vector[][];
		int sumaFilas[];
		int sumaCols[];

		int n,m;
		System.out.println("di el num de filas del vector");
		n = teclado.nextInt();
		System.out.println("di el num de columnas del vector");
		m = teclado.nextInt();
		
		if(n>0 && m>0){
			vector=new int[n][m];
			sumaFilas=new int[n];
			sumaCols= new int[m]; 
			for(int i=0;i< vector.length;i++){
				for(int j=0;j<vector[i].length;j++){
					vector[i][j]=(int)(Math.random()*101);
					System.out.print(vector[i][j] + "\t");
					sumaFilas[i]+=vector[i][j];
				}
				System.out.println();
			}
			for(int col=0;col<sumaCols.length;col++){
				for(int fil=0;fil<sumaFilas.length;fil++){
					sumaCols[col]+=vector[fil][col];
				}
			}
			
			//impresion
			System.out.println("la suma de las filas");
			for(int i=0;i<sumaFilas.length;i++){
				System.out.println(sumaFilas[i] + "\t");
			}
			
			System.out.println("la suma de las columnas");
			for(int i=0;i<sumaCols.length;i++){
				System.out.print(sumaCols[i] + "\t");
			}
		}
		else{
			System.out.println("es necesario que los n sean positivos");
		}
	}

}
