package Aves;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

		public static void main(String... args) {
			// el arraylist se declara de tipo Ave porque es la abstracta que luego podra instanciarse de cualquier tipo avevoladora o avecorredora
			ArrayList <Aves> misAves = new ArrayList();
			
			//no se puede hacer 								Aves a = new Aves("sdfsdf","fsdfsdf");
			
			misAves.add(new AveVoladora("Halcon Mexicano", "Falco mexicanus",85,"rapaz"));
	        misAves.add(new AveVoladora("Águila Pescadora", "Pandion haliaetus", 105, "rapaz"));
	        misAves.add(new AveVoladora("Tucán","Ramphastos toco", 60, "trepadora"));
	        misAves.add(new AveVoladora("Pavo Real", "Pavo cristatus", 92, "gallinácea"));
	        misAves.add(new AveVoladora("Garza", "Mesophoyx intermedia", 98, "zancuda"));
	        misAves.add(new AveVoladora("Flamenco","Phoenicopterus", 56, "zancuda"));
	        misAves.add(new AveCorredora("Avestruz","Avestruzius", 156, 100));
	        misAves.add(new AveCorredora("Gallina","Gallinasus", 2500, 12));
	        
	        /*Incrementa en 10 el número de individuos de las aves de la lista que estén en peligro de extinción*/
	        Iterator it = misAves.iterator();
	        String nombre;
	        int maximoVel = 0;
	        while(it.hasNext()) {
	        	Aves a = (Aves) it.next();
	        	if( a instanceof AveCorredora) {
	        		// o usando AveCorredora ac = (AveCorredora) a; 		ac.getVelMax
	        		if(((AveCorredora) a).getVelMax()>maximoVel) {
	        			maximoVel = ((AveCorredora) a).getVelMax();
	        		}
	        		System.out.println("ave corredora " + a.getNombreVulgar());
	        	}
	        	else if(a.peligroExtinción())
	        		a.incrementarNumeroIndividuos(10);
	        }
	        
	        /* Emite un listado con todos los datos de las aves que no están en peligro de extinción.*/
	        it = misAves.iterator();
	        while(it.hasNext()) {
	        	Aves a = (Aves) it.next();
	        	if(!a.peligroExtinción()) {
	        		System.out.println(a.toString());
	        		//System.out.println(it.next());
	        	}
	        }
	        
	        
		}
}
