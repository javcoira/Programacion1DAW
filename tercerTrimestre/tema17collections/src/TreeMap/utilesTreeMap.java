package TreeMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class utilesTreeMap {

	
	public static String devuelveProvincia(String cadena) {
		//cadena debe incluir obligatoriamente un -
		String provincia = null;
		int pos;
		pos=cadena.indexOf('-');
		provincia = cadena.substring(0,pos);
		return provincia;
	}
	
	public static Integer devuelveHabitantes(String cadena) {
		String habitantes = null;
		int pos;
		pos=cadena.indexOf('-');
		//ojo al pos+1, significa que escribe lo que sigue despues de pos hasta el final
		habitantes = cadena.substring(pos+1);
		//similar a parseInt
		return Integer.valueOf(habitantes);
	}
	
	public static String devuelveProvFormato(String cadena) {
		return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
	}
	
	public static void vuelcaTreeMap(TreeMap<String,Integer> mapa, String ruta) throws FileNotFoundException, IOException{
			String linea;
			File fichero = new File(ruta);
			FileWriter Fw = new FileWriter(fichero);
			BufferedWriter Bw = new BufferedWriter(Fw);
			//id es el nombre:mapaEnganchado.entrySet				for each(tipo id : recibe)
			for(Entry<String,Integer> id:mapa.entrySet()) {
				//linea = id.getKey() + "-" + id.getValue();
				linea = id.getKey() + "-" + mapa.get(id.getKey());
				Bw.write(linea);
				//salto de linea importante para que no se escriba todo en una linea
				Bw.newLine();
			}
			Bw.close();
	}
	
	public static TreeMap<String,Integer> vuelcaFichero (String ruta) throws FileNotFoundException, IOException{
		TreeMap<String,Integer> mapa = new TreeMap<String,Integer>();	
		//para abrir el fichero 
		FileReader flujo = new FileReader (ruta);
		//tuberia que toma lo leido y lo mete en memoria temporal
		BufferedReader Br = new BufferedReader(flujo);
		String linea;
		while((linea=Br.readLine())!=null) {
			mapa.put(devuelveProvincia(linea), devuelveHabitantes(linea));
		}
		Br.close();
		return mapa;
	}
}
