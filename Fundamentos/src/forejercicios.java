import java.util.Scanner;

public class forejercicios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int x=0,y,numero=0,menor=1, copia=0,maximo=0,cont=0,i=0, primero=0,valorPrimo=0, j=0, cont2=0,num=0;
		long Tini=0,Tfin=0,tiempo=0;
		float media=0;
		boolean sw = true;
		/*int numero=0, maximo=Integer.MIN_VALUE, cont=0, x=0;*/
		//int nn=Integer.MAX_VALUE=200;
		boolean primo=false;
		
		/*for (y=1; y <51; y++) {
		for(x=1; x<11; x++){
			System.out.println(y + " x " + x + " = " + (y*x));
		}
		System.out.println(" ");
	}*/
	
	/*10 numeros enteros y muestra el menor
	for(x=0;x<10;x++){
		System.out.println("introduce numero: ");
		numero = teclado.nextInt();
		System.out.println("numero: " + numero);
		//menor=numero;
		if(numero<menor){
			menor=numero;
		}
		System.out.println("El menor es: " + menor);
	}*/
	
	/*10 numeros enteros negativos y muestra el menor
	for(x=0;x<11;x++){
		System.out.println("introduce numero: ");
		numero = teclado.nextInt();
		System.out.println("numero: " + numero);
		//menor=numero;
		if(x==0)
			menor=numero;
		else if(numero<=menor){
			menor=numero;
		}
		System.out.println("El menor es: " + menor);
	}*/
	
	/*Programa que lee 10 números e indica si todos los números leídos son iguales o no.
	for(int i=0; i<10; i++){
		System.out.println("Introduce numero " + (i+1) + " :");
		numero = teclado.nextInt();
		if(i==0)
			copia=numero;
		if(copia==numero){
			x++;
		}
		else{
			System.out.println("No son iguales!");
			break;
		}		
	}
	if(x==10)
		System.out.println("Los 10 numeros son iguales!");*/
	/*-----------------------------------------------------------------------------------
	 * otra forma de solucionarlo*/
	 /* Scanner teclado new = Scanner(System.in);
	  int num, num1, i;
	  boolean sw=true;
	  System.out.println("introduce un numero")
	  num1=teclado.nextInt();
	  for(i=1;(i<10 && sw);i++){  //sw == true
	  	System.out.println("Introduce un numero");
	  	num=teclado.nextInt();
	  	if(num1!=num)
	  		sw=false;
	  	}
	  if(sw)
	  	System.out.println("todos eran iguales a " + num1);
	  else
	  	System.out.println("habia numero diferentes");*/
	/*-----------------------------------------------------------------------------------*/
	
	/*Programa que lea 20 números y averigüe la media aritmética de todos ellos
	for(x=0;x<20;x++){
		System.out.println("Introduce numero " + (x+1) + " :");
		numero = teclado.nextInt();
		copia+=numero;
	}
	System.out.println("La media artimetica es: " + (copia/x));*/

		/*Programa que lee 40 números. Al finalizar mostrará el máximo introducido, y 
		 * cuántas veces se repite dicho máximo.*/
		/*for(x=0;x<10;x++){
			System.out.println("Introduce numero " + (x+1) + " :");
			numero = teclado.nextInt();
			if(x==0)
				maximo=numero;
			if(numero>maximo){
				maximo=numero;
				cont=1;		
			}
			else if(numero==maximo){
				cont++;
			}
		}
		System.out.println("El numero maximo es: " + maximo + " y se repite " + cont);*/
		
		/*Programa que lee 9 números, y en el caso en el que el primero introducido sea igual 
		 * al último, nos muestra la media. En caso contrario, no se mostrará nada*/
		/*for(x=0;x<9;x++){
			System.out.println("Introduce numero " + (x+1) + " :");
			numero = teclado.nextInt();
			if(x==0)
				primero=numero;
			
			media+=numero;
			
			if((x==8) && (primero==numero)){
				System.out.println("la media es: " + (media/9));
			}
			else if(x==8 && primero!=numero){
				System.out.println("no pasa nada ");
			}
		}*/
		
		/*Programa que muestra todos los divisores de un número introducido. Entre los divisores 
		 * no se incluirá el propio número.
		 */
		/*System.out.println("Introduce numero :");
		numero = teclado.nextInt();
		for(int j=1;j<numero;j++){
			if(numero%j==0){
				System.out.println("el numero: " + j + " es divisor de " + numero);
			}
		}*/
		
		
		/*Programa que muestre las tablas de multiplicar de los 10 primeros números naturales 
		(números del 1 al 10)
		for (y=1; y <11; y++) {
			for(x=1; x<11; x++){
				System.out.println(y + " x " + x + " = " + (y*x));
			}
			System.out.println(" ");
		}*/
		
		
		/*Calcula el factorial de un número leído por teclado*/
		/*System.out.println("Introduce numero :");
		numero = teclado.nextInt();
		if(numero<0){
			System.out.println("no se aceptan numeros negativos");

		}else{
			primero=1;
			for(i=numero;i>=1;i--){
				primero*=i;
			}
			System.out.println("el factorial del numero es: " + primero);
		}*/
		
		/*Calcula y muestra el factorial de los 10 primeros números naturales*/
		/*primero=1;
		for(i=1;i<11;i++){
			for(j=i;j>=i;j--){
				primero*=j;
			}
			System.out.println("el factorial del numero: " + i + " es: " + primero);
		}*/
		
		/*Programa que averigua si un número leído es primo o no.*/
		/*System.out.println("Introduce numero :");
		numero = teclado.nextInt();
		Tini=System.currentTimeMillis();
		if (numero > 0) {
			for (j = 1; j < numero; j++) {
				if (numero % j == 0) {
					cont++;
					if (cont > 2)
						break;
					System.out.println("el numero: " + j + " es divisor de " + numero);
				}
			}
			Tfin = System.currentTimeMillis();
			tiempo = Tfin-Tini;
			if (cont > 1)
				System.out.println("no es primo " );
			else
				System.out.println("es primo, tiempo: " + tiempo + "ms");
		} else
			System.out.println("no se puede hacer con negativos o 0");*/
		/*-------------------------------------------------------------------------------------------------*/
		/*resuelto en clase*/
		/*boolean sw=true;
		Tini=System.currentTimeMillis();
		if(numero>0){
			for(i=2;(i<numero && sw);i++){
				if(numero%i==0)
					sw=false;
			}
			Tfin = System.currentTimeMillis();
			tiempo = Tfin-Tini;
			if(sw)
				System.out.println(numero + " es primo con tiempo: " + tiempo + "ms");
			else
				System.out.println(numero + " no es primo");
		}else
			System.out.println("solo se aceptan numeros mayores que 0");*/
		
		
		/*Programa que muestra los números primos existentes entre el 1 y el 100. */
		/*for(j=1;j<100;j++){
			cont=0;
			for(i=1;i<100;i++){
				if(j%i==0)
					cont++;
			}

			if(cont==2){
				cont2++;
				System.out.println(j);
			}
			
		}
		System.out.println("total numeros primos: " + cont2);*/
		/*-------------------------------------------------------------------------------------------------*/
		/*resuelto en clase*/
		/*for(j=2;j<101;j++){
			num=j;
			sw=true;
			for(i=2;i<num;i++){
				if(num%i==0){
					sw=false;
					break;
				}
			}
			if(sw)
				System.out.println(num + " es primo");
		}*/
		/*resuelto en clase*/
		
			
		
		/*Programa que muestra los 100 primeros número primos.*/
		
		/*for(j=1;cont2<100;j++){
			cont=0;
			for(i=2;i<=j;i++){
				if(j%i==0){
					cont++;
				}
			}
			if(cont==1){
				cont2++;
				System.out.println("primo n" + cont2 + " :" + j);
			}
		}*/

	}
}
