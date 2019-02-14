import java.util.Scanner;

public class hoja6_ejercicios {
	/**
	 * clase de hoja6_ejercicios
	 * @param args = argumentos;
	 */
	public static void main(String[] args) {
		/*Solicita las 20 notas con decimales de los alumnos de una clase. Calcula y 
		 * muestra la nota media obtenida por el grupo. Muestra después cuántos alumnos
		 *  tienen una nota superior o igual a la media.Ayuda para redondear Math.rint(numero*cifras)/cifras; 
		 */
		/*int cont=0;
		double nota,media=0;
		double notas[] = new double[20];
		
		for(int i=0; i<notas.length;i++){
			nota=Math.random()*10;
			//ojo al math rin su uso
			notas[i]=Math.rint(nota*100)/100;
			System.out.println("nota " + (i+1) + " es " + notas[i]);
			media+=notas[i];
		}
		media/=20;
		//deja 2 decimales
		media = Math.rint(media*100)/100;
		System.out.println("\nnota media es "+media);
		for(int i=0;i<notas.length;i++){
			if(notas[i]>=media){
				cont++;
				System.out.println("nota  " + i + " es " + notas[i]);
			}
			
		}
		System.out.println("\nHay " + cont + " alumnos con mas de la nota media");*/
	
		/*Rellena un array de 100 casillas con números aleatorios comprendidos entre 1 y 100 
		 * (ambos incluidos). Posteriormente pide un valor al usuario comprendido entre 1 y 100 
		 * (insiste en la lectura del valor hasta que el número sea válido y esté comprendido entre 1 y 100) 
		 * y muestra en pantalla si el valor dado aparece en el array o no, y si aparece indica en qué 
		 * posiciones del array aparece.
		 */
	
		/*Scanner teclado = new Scanner(System.in);
		int j = 0, dato,vector[] = {-25,10,20,40,55,67,69,100,555,777};
		int veces=0;
		
		for(int i=0;i<vector.length;i++){
			//cast int pasa a numero entero sin decimales
			//vector[i] = (int)(Math.random()*100+1);
			System.out.println("dato " + i + " es " + vector[i]);
		}
		do{
			System.out.println("Dame un valor entre -1000 y 1000");
			dato = teclado.nextInt();
		}while(dato >1000 || dato<1);
		System.out.println("Dato que buscamos es " + dato);
		while(j<vector.length && dato<vector[j]){
			j++;
		}
		if(j<vector.length && dato==vector[j]){//recordar lo de && si el de la izquierda no se cumple ya no entra
			System.out.println("dato esta en ");
		}else{
			System.out.println("dato no esta en ");
		}*/
			
		/*parte del otro ejercicio*/
		/*for(j=0; j<vector.length;j++){
			if(vector[j]==dato){
				veces++;
				System.out.println("dato " + dato + " estaba en posicion " + j);
			}	
		}
		if(veces==0){
			System.out.println("dato " + dato + " no estaba ");
		}*/
		
		/*Dado un array de 10 casillas relleno con números aleatorios comprendidos entre 1 y 10 (ambos incluidos). 
		- Muestra su contenido en una línea de pantalla. 
		- Intercambia el valor de la primera casilla con el valor de la última casilla
		- Muestra el contenido actual del array en una línea de pantalla.*/
		
		/*int lista[] = new int[10];
		int cambio;
		for(int j=0;j<lista.length;j++){
			lista[j]=(int)(Math.random()*10+1);
		}
		//for(int a : lista)
			//System.out.print(a);
		for(int i = 0;i<lista.length;i++){
			System.out.print(" " + lista[i]);
		}
		cambio=lista[0];
		lista[0]=lista[lista.length-1];
		lista[lista.length-1]=cambio;
		System.out.println();
		for(int i = 0;i<lista.length;i++){
			System.out.print(" " + lista[i]);
		}/*
		
		/*Rellena un array con el resultado del cálculo del factorial de los números del 1 al 20 y 
		 * muestra posteriormente su contenido en pantalla.
		NOTAS: 
		Para el cálculo del factorial de un número debes utilizar el factorial que ya has calculado 
		para el número anterior. 
		En una variable de tipo int no cabe el factorial de 20.
		*/
		/*long fact[] = new long[20];
		
		for(int i=1;i<fact.length;i++){
			if(i==1)
				fact[i]=i;
			else
			fact[i]=i*fact[i-1];
		}
		for(int i = 0;i<fact.length;i++){
			System.out.println(" " + fact[i]);
		}*/
		
		
		/*Realiza un programa que lea desde teclado 10 números, pero que no permita introducir
		números repetidos. El programa acabará cuando haya obtenido 10 números distintos que mostrará 
		posteriormente en pantalla.
		 */
		int leidos[] = new int[10];
		Scanner sc = new Scanner(System.in);
		boolean ok = false, iguales=false;
		
		for(int i=0;i<leidos.length;i++){
			System.out.println("Introduce numero " + (i+1) + " : " );
			leidos[i] = sc.nextInt();
			for(int j=0;j<i;j++){
				if(leidos[i]==leidos[j]){
					iguales=true;
					break;
				}else
					iguales=false;
			}
			if(iguales){
				System.out.println("Ese numero que ya existe en la lista!");
				System.out.println("Introduce uno nuevo!\n");
				i--;
			}
		}
		for(int i = 0;i<leidos.length;i++){
			System.out.print("Tu lista es: " + leidos[i]);
		}

	}

}
