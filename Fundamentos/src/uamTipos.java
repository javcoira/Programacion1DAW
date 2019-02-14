import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class uamTipos {
	public static void main(String... args){
		/*------------------------------Listas-----------------------------*/
		/*no eliminan strings iguales, se puede usar get para obtner una direccion*/
		List<String> prueba = new ArrayList<>(Arrays.asList("Pepe","Juancho","Augusto"));
		System.out.println(prueba);
		
		List<String> amigos = new ArrayList<>();
		amigos.add("Luis");  amigos.add("Leo");  amigos.add("José");
		System.out.println("amigos sin ordenar "+amigos );
		Collections.sort(amigos);
		System.out.println("amigos ordenados "+amigos);
		if ( args.length >= 1 && amigos.contains( args[0] ) ) { 
			System.out.println( "Hello " + args[0] + "!" );}
		
		List<String> alumnos = new LinkedList<>();
		alumnos.add("Alumno1"); alumnos.add("Alumno2"); alumnos.add("Alumno3");
		System.out.println(alumnos);
		
		amigos.addAll(alumnos);
		System.out.println("Tus nu evos amigos son: "+amigos);
		
		prueba.addAll(amigos);
		System.out.println("Tus nuevos nuevos amigos son"+prueba);
		
		System.out.println(amigos.get(0));
		
		/*--------------------------------Conjuntos-------------------------*/
		/*Si eliminan strings iguales, no sirve el get para obtener un valor, no se puede usar el
		 * Arrays.asList()*/
		System.out.println("Conjuntos, set, TreeSet, HashSet");
		Set<String> nombres = new TreeSet<>();
		nombres.add("Juan"); nombres.add("Leo"); nombres.add("Pepe");
		System.out.println(nombres);
		Set<String> nombresParecidos = new HashSet<>();
		nombresParecidos.add("Pepe"); nombresParecidos.add("Pedro"); nombresParecidos.add("Luz");
		System.out.println(nombresParecidos);
		
		System.out.println("son iguales: " + nombres.equals(nombresParecidos));
		nombres.addAll(nombresParecidos);
		System.out.println(nombres);
		nombresParecidos.addAll(nombres);
		System.out.println(nombresParecidos);
		
		System.out.println("son iguales: " + nombres.equals(nombresParecidos));
 		
		//Set<ArrayList> pruebaArrays = new HashSet<>(Arrays.asList("no","funciona","con","Arrays"));
		//System.out.println(nombres.get(0));
		
		/*-------------------------------Mapas------------------------------*/
		/*Mas utiles que las listas y los conjuntos porque permiten combinar tipos
		 * y se puede buscar uno de los 2 get("ana")*/
		
		Map<String,Integer> mapas = new HashMap<>();
		mapas.put("pepe", 3);
		mapas.put("juan", 56);
		mapas.put("alberto", 444);
		System.out.println(mapas);
		System.out.println("el numero de la suerte de juan es " + mapas.get("juan"));
		if(mapas.containsKey("ana"))//cambiar por pepe
			System.out.println("en numero de la suerte de pepe es " + mapas.get("pepe"));
		else
			System.out.println("no existe ese usuario");
		
		Map<String,Integer> contadorP = new HashMap<>();
		
		//ojo donde se pone palabra
		for(String palabra : args){
			if(contadorP.containsKey(palabra)){
				contadorP.put(palabra, contadorP.get(palabra)+1);
			}
			else
				contadorP.put(palabra, 1);
		}
		System.out.println(contadorP);
		
		//TreeMap muestra las palabras repetidas en orden alfabetico
		Map<String,Integer> contadorT = new TreeMap<>();
		String linea = ("palabras este texto debe tener algunas palabras repetidas debe tener palabras");
		
		//ojo no se puede recorrer el string ya que no es una lista, array o algo asi
		//para poder recorrerlo se establece un separador que sera (" ") o ("\\s+")
		for(String palab : linea.split(" ")){
			if(contadorT.containsKey(palab)){
				contadorT.put(palab, contadorT.get(palab)+1);
			}else
				contadorT.put(palab, 1);
		}
		System.out.println(contadorT);
		
		
		
		
		/*-----------------------------------------------------------------*/
		/*Realiza un programa que lea desde teclado 10 números enteros, para posteriormente
		mostrarlos en el orden inverso al que fueron introducidos.
		 */
		/*Scanner sc = new Scanner(System.in);
		int []numeros = new int [3];

		for(int i=0;i<numeros.length;i++){
			System.out.println("Introduce numero: ");
			numeros[i]=sc.nextInt();
		}
		
		for(int i=numeros.length-1;i>=0;i--){
			System.out.println("numero "+ i + " : " + numeros[i]);
		}*/
		
		/*preguntar rectangulo o felcha, luego rectangulo filas y culumnas y punta solo el ancho maximo
		 * filas =2 columnas =8
		 * ********
		 * ********
		 * punta=4
		 * *
		 * **
		 * ***
		 * ****
		 * ***
		 * **
		 * *
		 * */
	}
}