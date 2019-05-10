package serHumano.ejer3Lista;

import java.util.HashMap;

public class Ejercicio2 implements Comparable<Ejercicio2>{

	public static void main(String[] args) {
		final int VALMAX = 10, VALMIN = 3;
		int letra=65;
		 HashMap<String,Double> robot = new HashMap<String,Double>();
		 int numeroRobots = (int) (Math.random()*(VALMAX - VALMIN + 1) + VALMIN);
		 
		 for(int i=1;i<=numeroRobots;i++) {
			 robot.put(Character.toString((char)letra), (double)(Math.round((Math.random()*98+1)*10.0)/10.0));
			 letra++;
		 }
		 
		 System.out.println(robot);
	}

	@Override
	public int compareTo(Ejercicio2 O) {
		return 0;
	}

	/*
	 *  int resultado=0;

        if (this.edad<o.edad) {   resultado = -1;      }

        else if (this.edad>o.edad) {    resultado = 1;      }

        else {

            if (this.dni<o.dni) {  resultado = -1;    }

            else if (this.dni>o.dni) {   resultado = 1;   }

            else {   resultado = 0;   }

        }

        return resultado;

    }*/

	
}
