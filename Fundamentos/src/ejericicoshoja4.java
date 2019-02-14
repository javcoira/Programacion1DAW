import java.util.*;

/*Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive.
 *  En el caso en el que algún número introducido no se encontrara dentro del rango permitido, 
 *  se mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando 
 *  se hayan introducido 11 números válidos y mostrará el número máximo introducido de los 11 válidos, 
 *  y además nos indicará cuántos números de los introducidos no han sido válidos.
*/
public class ejericicoshoja4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int numero, noFunciona=0,maximo=19;
		for(int i=0;i<11;i++){
			System.out.println("Introduce numero entre 20 y 40 incluido: ");
			numero = sc.nextInt();
			while(numero<20 || numero>40){
				noFunciona++;
				System.out.println("Fuera de rango, Intentalo de nuevo! ");
				numero = sc.nextInt();
			}
			if(numero>maximo){
				maximo=numero;
			}
		}
		System.out.println("El mayor es: " + maximo);
		System.out.println("para conseguir 11 numero en rango pusiste: " + noFunciona + " erroneos");*/
		
		/*Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y el 100 
		 * y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento del Jugador2,
		 *  y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No llegaste”, según corresponda
		 * De la misma manera, y al terminar el programa, se mostrarán los mensajes “Acertaste” o bien 
		 * “Intentos agotados”.
		 */
		//numJ1 maquina
		/*int intentos=10,numJ2;
		int numJ1 = (int)(Math.random()*99+1);
		System.out.println("adivina un numero entre 1 y 100 con " + intentos + " intentos");
		
		do{
			System.out.println("Cual crees que es el numero?");
			numJ2 =sc.nextInt();
			intentos--;
			if(numJ1>numJ2){
				System.out.println("Te quedaste por debajo");
			}else if(numJ1<numJ2){
				System.out.println("Te quedaste por encima");
			}
		}while(numJ1 != numJ2 && intentos>0);
		System.out.println("el numero era "+ numJ1);
		if(numJ1==numJ2){
			System.out.println("acertaste "+ (10-intentos) + " intentos");
		}else{
			System.out.println("no acertaste en 10 intentos");
		}*/
		
		/*version con usuario propone numero aleatorio y la maquina intenta adivinarlo partiendo por la mitad
		cada vez que lo lee
				int intentos=10,numJ2,num,izda=1,dcha=100,mitad;
				int numJ1 = (int)(Math.random()*99+1);
				char caracter;
				System.out.println("introduce un numero entre" + izda + " y  " + dcha + " con " + intentos + " intentos");
				numJ2=sc.nextInt();
				if(numJ2<izda || numJ2>dcha){
					System.out.println("numero fuera de rango");
				}else{
					do{
						mitad =(izda+dcha)/2;
						System.out.println("es tu numero el " + mitad);
						intentos--;
						if(numJ2!=mitad){
							System.out.println("por encima escribe E");
							System.out.println("por debajo escribe D");
							caracter=sc.next().charAt(0);
							if(caracter == 'E'){
								izda=mitad+1;
							}else if(caracter == 'D'){
								dcha=mitad-1;
							}else{
								System.out.println("vuelve a introducirlo");
							}
						}
					}while(numJ2!=mitad && intentos>1);
					if(mitad==numJ2){
						System.out.println("acertaste "+ (10-intentos) + " intentos");
					}else{
						System.out.println("no acertaste en 10 intentos");
					}
				}	
				}*/
		
		
		/*Programa que lea un carácter a través del teclado hasta que éste sea una letra mayúscula*/
		      /*  char ch;
		        do {
		            System.out.print("Escribe palabras y termina en una palabra cuya primera letra sea"
		            		+ "mayuscula: " );
		            ch=sc.next().charAt(0);
		        } while ((ch<65 || ch>90) && (ch != 209));
		        System.out.println("Fin de programa");*/
		


	}

}
