package hoja7;

import java.util.Scanner;

public class matrizIdentidad {

	public static void mostrar(int tabla[][]){
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void matrizInversa(int numero){
		int n=0;
		int[][] tabla = new int[numero][numero];
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				if(i+j==numero-1){
					tabla[i][j]=1;
				}
			}
		}
		System.out.println("Tabla inversa:");
		mostrar(tabla);
	}
	
	public static void main(String[] args) {
		int tabla[][];
		int numero;

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce numero: ");
		numero = sc.nextInt();
		tabla = new int[numero][numero];
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				if(i==j)
					tabla[i][j]=1;
				else
					tabla[i][j]=0;
			}
		}
		
		mostrar(tabla);
		matrizInversa(numero);

	}
	}

