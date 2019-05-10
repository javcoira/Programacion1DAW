package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class pruebaMap {

	public static void main(String[] args) {

		HashMap<String, String> objMap = new HashMap<String, String>();
		
		//nuevo
		String valor;
		
		objMap.put("Nombre", "Suzuki");
		objMap.put("Potencia", "220");
		objMap.put("Tipo", "2-wheeler");
		objMap.put("Precio", "85000");
		System.out.println("Elementos del mapa:");
		System.out.println(objMap);
		System.out.println(objMap.isEmpty());
		System.out.println(objMap.get("Tipo"));
		System.out.println(objMap.size());
		System.out.println(objMap.values());
		System.out.println(objMap.containsValue("220"));
		System.out.println(objMap.containsKey("Precio"));
		objMap.put("Duenio", "Pepe");
		System.out.println("Elementos del mapa:");
		System.out.println(objMap);
		//objMap.clear();
		System.out.println(objMap);
		
		//nuevo, id es la clave del mapa
		//recorrido de map
		for(Entry<String,String> id:objMap.entrySet()) {
			System.out.println(id.getKey() + "-> " + id.getValue());
		}
		
		//actualizar el valor, precio a 90000
		if(objMap.containsKey("Precio")) {
			objMap.put("Precio", "90000");
		}
		
		System.out.println(objMap);
	}
}
