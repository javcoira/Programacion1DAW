package serHumano.ejer3Lista;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ejercicio3 {

	public static void main(String[] args) {

		HashMap <Integer,Double> listaDecimales = new HashMap<Integer,Double>();
		int i=1,cont=0;
		double sumatorio=0, media=0;
		
		for(int j=1; j<=20; j++) {
			listaDecimales.put(j, (double)(Math.round((Math.random()*99+1)*10.0)/10.0));
		}
	
		System.out.println(listaDecimales);
		
		HashMap <Integer,Double> listaDecimales2 = new HashMap<Integer,Double>();
		
		
		for(Entry<Integer, Double> clave:listaDecimales.entrySet()) {
			if(clave.getValue()>25.4){
				listaDecimales2.put(i, clave.getValue());
				i++;
			}
		}
		
		System.out.println(listaDecimales2);
		
		for(Entry <Integer, Double> clave:listaDecimales2.entrySet()) {
			sumatorio += clave.getValue();
			cont++;
		}
		
		media = sumatorio/cont;
		
		System.out.println("la media es: " + Math.rint(media * 100.0)/100.0);
	}

}
