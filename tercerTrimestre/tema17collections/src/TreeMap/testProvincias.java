package TreeMap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class testProvincias {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		TreeMap<String,Integer> miMapa = new TreeMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		String provincia;
		Integer nuevoValorHab;
		miMapa = utilesTreeMap.vuelcaFichero("provincias.txt");
		
		System.out.println("Habitantes de Madrid: " + miMapa.get("Madrid"));
		System.out.println("Introduce una provincia: ");
		provincia = sc.next();
		System.out.println("La provincia tiene: " + miMapa.get(provincia));
		System.out.println("Introduce nuevo valor de habitantes: ");
		nuevoValorHab = sc.nextInt();
		miMapa.put(provincia, nuevoValorHab);
		utilesTreeMap.vuelcaTreeMap(miMapa, "provincias.txt");
	}
}
