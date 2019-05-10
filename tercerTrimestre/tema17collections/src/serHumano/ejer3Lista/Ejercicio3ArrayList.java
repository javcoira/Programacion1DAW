package serHumano.ejer3Lista;

import java.util.ArrayList;

public class Ejercicio3ArrayList {
	
	public static void imprime(ArrayList <Double> al) {
		for(int i=0; i<al.size();i++) {
			System.out.println(Math.round(al.get(i)));
		}
	}

	public static void main(String[] args) {
	ArrayList<Double> decimales = new ArrayList<Double>();
	ArrayList<Double> decimales25 = new ArrayList<Double>();
	double valor, cont=0;
	int cuantos = 0;
	
	for(int i=0;i<cuantos;i++) {
		valor=Math.random()*100+1;
		decimales.add(valor);
	}
	
	for(int i=0;i<decimales.size();i++) {
		if(decimales.get(i)>25.4) {
			cont += decimales.get(i);
			decimales25.add(decimales.get(i));
		}
	}
	
	System.out.println("media es " + (cont/decimales25.size()));
	System.out.println(decimales);
	System.out.println("pequenia");
	System.out.println(decimales25);
	
	
	}

}
