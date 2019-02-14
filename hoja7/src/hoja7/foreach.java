package hoja7;
import java.math.*;

public class foreach {

	public static void main(String[] args) {
		//TODO lista en 3 dimensiones con ejemplo normal y ejemplo foreach
		int urba[][][] = new int[2][4][3];
		int sum=0;
		//creacion de un array con datos includios
		double notas[][]={{5.3,7.6,8.0},{3.4,5.6,4.7,7,8},{10,5.7}};
		for(int bloq=0;bloq<urba.length;bloq++){
			System.out.println("Datos del bloque " + bloq);
			for(int plant=0;plant<urba[bloq].length;plant++){
				System.out.println("Datos de la planta " + plant);
				for(int vivi=0;vivi<urba[bloq][plant].length;vivi++){
					urba[bloq][plant][vivi]=(int) (Math.random()*7);
					System.out.print(urba[bloq][plant][vivi] + "\t");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		//vamos a usar foreach
		for(int bloque[][]:urba){
			for(int planta[]:bloque){
				for(int vivienda:planta){
					sum+=vivienda;
				}
			}
		}
		System.out.println("el numero de habitaciones de urba es " + sum);
	}

}
