package ficheros_bin;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Binario2 {

	public static void main(String[] args) throws IOException {
		int filas,columnas;
		double [][] matriz; //declaramos la matriz
		Scanner sc = new Scanner(System.in);
		//punteros
		DataOutputStream data=null;
		FileOutputStream fic=null;
		//pedimos datos matriz
		System.out.println("Nº de filas:");
		filas=sc.nextInt();
		System.out.println("Nº de columnas:");
		columnas=sc.nextInt();
		//ahora que tenemos los datos creamos la matriz
		matriz=new double[filas][columnas];
		//recorrer matriz
		
		for (int i=0;i<filas;i++) {
			for (int j=0;j<columnas;j++) {
				System.out.println("Valor para la fila " + i + " columna "+ j);
				matriz[i][j]=sc.nextDouble();
			}
		}
		try {
			fic=new FileOutputStream("c:\\adb\\matriz.dat");//crear fichero
			data=new DataOutputStream(fic); //crear tuberia que nos conecte al fichero
			//la tuberia tiene los metodos que me permiten escribir,para eso la creamos
			data.writeInt(filas);
			data.writeInt(columnas);
			for (int i=0;i<filas;i++) {
				for (int j=0;j<columnas;j++) {
					System.out.println("Valor para la fila " + i + " columna "+ j);
					data.writeDouble(matriz[i][j]);
				}
			}
		} catch (FileNotFoundException ex) {

		}
	}

}
