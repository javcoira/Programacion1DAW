package serHumano.ejer3Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Ejercicio2TestRobot {

	public static void imprimir(ArrayList<Robot> lista) {
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		final int VALMAX = 10, VALMIN = 3;
		int letra = 65;
		HashMap<Integer, Robot> robot = new HashMap<Integer, Robot>();
		int numeroRobots = (int) (Math.random() * (VALMAX - VALMIN + 1) + VALMIN);

		for (int i = 1; i <= numeroRobots; i++) {
			Robot r = new Robot(Character.toString((char) letra) + i,
					(double) (Math.round((Math.random() * 98 + 1) * 10.0) / 10.0));
			robot.put(i, r);
			letra++;
		}
		System.out.println(robot);

		ArrayList<Robot> mapValues = new ArrayList<Robot>(robot.values());
		Collections.sort(mapValues);
		
		System.out.println("impresion despues de ordenar: ");
		imprimir(mapValues);
		//System.out.println(mapValues);
		
		double valorLimite = (double) (Math.round((Math.random() * 98 + 1) * 10.0) / 10.0);
		ArrayList<Robot> robotSuperP = new ArrayList<Robot>();
		
		System.out.println("Valor aleatorio: " + valorLimite);
		
		int posicion = 0;
		for(int i=0;i<mapValues.size();i++) {
			if(mapValues.get(i).getPorcentaje() > valorLimite) {
				posicion = i;
				break;
			}else {
				posicion = mapValues.size();
			}
		}
		
		System.out.println(posicion);
		
		for(int i = posicion; i<mapValues.size(); i++) {
			robotSuperP.add(mapValues.get(i));
		}
		
		System.out.println(robotSuperP);
	
	
		//HashMap<Integer, Robot> robot2 = new HashMap<Integer, Robot>();
		
		/*for (Entry<Integer, Robot> clave : robot.entrySet()) {
			if(clave.getValue().compareTo(clave.getValue()) == 1) {
				
			}
		}*/
	}
}
