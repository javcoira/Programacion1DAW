package prueba2;

public class alumnos2 {
	
	/*public static String[] asignar(String[] nombres, int[] notas){
		String resultado[]=new String[nombres.length];
		for(int i=0;i<resultado.length;i++){
			if(notas[i]<5 && notas[i]>=0){
				resultado[i]="suspenso";
			}else if(notas[i]>=5 && notas[i]<11){
				resultado[i]="aprobado";
			}else
				System.out.println("el numero no esta entre 0 y 1");
		}
		return resultado;
	}	*/
	
	public static void mostrar(String[] res, String[] nombres, int[] notas){
		for(int j=0;j<notas.length;j++){
			System.out.println(nombres[j] + " " + res[j] + " con nota: " + notas[j]);
		}
	}
	
	public static String[] asignarSwitch(int[] notas){
		String res[]=new String[notas.length];
		
		for (int i = 0; i < notas.length; i++) {
			switch (notas[i]) {
			case 0: case 1: case 2: case 3: case 4:
				res[i] = "suspenso";
				break;
			case 5: case 6: case 7:
				res[i] = "aprobado";
				break;
			case 8: case 9:
				res[i] = "notable";
				break;
			case 10:
				res[i] = "sobresailente";
				break;
			}
		}
		return res;
	}

	public static void main(String[] args){
		int notas[]={7,4,6,8,2,9,5,6,1,9};
		String nombres[]={"juan","eva","luis","maria","juan","albert","ana","jorge","marc","pedro"};
		//String resultado[] = asignar(nombres,notas);
		String res[] = asignarSwitch(notas);
		mostrar(res,nombres,notas);
		}
		
	/*otra forma seria crear un metodo que reciba un notas[i] y  lo vaya comparando en un case y lo devuleva
	 * cada vez, este estara en el main en un for que recorra todo el array y vaya llamando a este metodo cada 
	 * vez ........... sysout(alumno + tiene nota + traduceNota(notas[i]) ........  el metodo recibe int nota
	 * y devuelve String dentro de cada case diciendo sobresaliente, suspenso, etc, cada vez que se le llame
	 * )*/
	
	
	}

