package hoja7;

public class cartasProfe {

	public static void main(String[] args) {
		String[] numero = {"dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey", "as"};
		String[] palo = {"copas", "bastos", "espadas", "oros"};
		int[][] cartas = new int[2][2];
		int indiceN, indiceP;
		for(int i=0;i<2;i++){
			//indice de 0 es para el jugador el 1 es para la banca
			indiceN = (int)(Math.random()*numero.length);
			indiceP = (int)(Math.random()*palo.length);
			
			cartas[i][0] = indiceN;
			cartas[i][1] = indiceP;
			
			if(i==1 && cartas[i][0] == cartas [i-1][0] && cartas[i][1] == cartas[i-1][1])
				System.out.println("\n\n\n\nLa misma carta\n\n\n\n");
				i--;
		}
		
		System.out.println("la banca obtuvo " + numero[cartas[1][0]] + " de " + palo[cartas[1][1]]);
		System.out.println("el jugador obtuvo " + numero[cartas[0][0]] + " de " + palo[cartas[0][1]]);
		
		if(cartas[1][0] >= cartas[0][0]){
			System.out.println("gana la banca " + numero[cartas[1][0]] + " de " + palo[cartas[1][1]]);
		}else{
			System.out.println("gana el jugador con " + numero[cartas[0][0]] + " de " + palo[cartas[0][1]]);
		}

	}

}
