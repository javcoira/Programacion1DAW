package serHumano.ejerRobotProfe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class usaRobot {

	public static double redondear(double numero, int decimales) {
		return Math.round(numero*Math.pow(10, decimales))/Math.pow(10, decimales);
	}
	
	public static void recorrer (ArrayList <Robot> listaR) {
		Iterator it=listaR.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Robot> misRobot = new ArrayList<Robot>();
		ArrayList<Robot> misRobotFiltrado = new ArrayList<Robot>();
		int numRobots = (int) (Math.random()*(10-3+1)+3);
		String codigo;
		Double v, filtro;
		boolean existe = false;
		int j=misRobot.size()-1;
		
		for(int i=1;i<numRobots+1;i++) {
			char letra=(char)(64+i);
			codigo=letra+Integer.toString(i);
			v=(Double)redondear((Math.random()*(98-1+1)+1),2);
			misRobot.add(new Robot (codigo,v));
			letra++;
		}
		
		recorrer(misRobot);
		Collections.sort(misRobot);
		System.out.println("despues de ordenar");
		recorrer(misRobot);
		filtro = (Double)redondear((Math.random()*(98-1+1)+1),2);
		System.out.println("valor del filtro " + filtro);
		
		//j>=0 nos verifica que existen valores en el arraylist, es importatnte ponerlo primero ya que si no existen no comprobara la segunda opcion
		while(j >= 0 && misRobot.get(j).getVida() > filtro) {
			misRobot.get(j).toString();
			misRobotFiltrado.add(misRobot.get(j));
			existe=true;
			j--;
		}
		
		Collections.sort(misRobotFiltrado);
		recorrer(misRobotFiltrado);
	}

}
