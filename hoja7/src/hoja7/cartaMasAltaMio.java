package hoja7;

public class cartaMasAltaMio {

	public static String aleatorio(String[] aray){
		int aleatorio = 0;
		String resul;
		
		aleatorio = (int)(Math.random()*(aray.length));
		resul = aray[aleatorio];
		
		return resul;
	}
	
	public static String[] arayResul(String carta, String tipo, String usua){
		String[] listaRes = null;
		
		listaRes[0] = usua;
		listaRes[1] = carta;
		listaRes[2] = tipo;
		
		return listaRes;
	}
	
	public static void main(String[] args) {
		String[] numero = new String[] {"dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey", "as"};
		String[] palo = new String[] {"copas", "bastos", "espadas", "oros"};
		String[] res = new String[3];
		String carta;
		String tipo;
		
		carta = aleatorio(numero);
		tipo = aleatorio(palo);
		
		arayResul(carta, tipo, "banca");
		
		for (String a : res)
			System.out.print(a + " ");
		
		
		
	}

}
