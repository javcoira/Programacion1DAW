import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicioshoja6 {

	public static void main(String... args){
		/*int misNumeros[] = new int[6];
		int tam;
		double media = 0;
		double [] notas;
		//no funciona esa forma de declararlos
		//List<Integer> numeros = List.of(5,3,5,2,3);
		//List<Integer> numero = new ArrayList<>(ArrayList.asList(6,4,5,4,3));
	
		Scanner sc = new Scanner(System.in);
		misNumeros[0]=1970;
		misNumeros[1]=8;
		misNumeros[2]=8;
		misNumeros[3]=2;
		misNumeros[4]=4;
		misNumeros[5]=5;
		//recorrido de adelante hacia atras
		for(int i=0; i<misNumeros.length;i++){
			System.out.println("el contenido del elemento con posicion " +
			i + " es " + misNumeros[i]);
			media += misNumeros[i];
		}
		media/=misNumeros.length;
		System.out.println("\nLa media de mis numeros es: " + media);
		System.out.println();
		//recorrido inverso
		for(int i=misNumeros.length-1; i>=0;i--){
			System.out.println("el contenido del elemento con posicion " +
			i + " es " + misNumeros[i]);
		}
		System.out.println("\nCuantos alumnos quieres calificar: ");
		tam=sc.nextInt();
		notas=new double[tam];
		media=0;
		//rellenar el array con valore aleatorios entre 0-10
		for(int i=0;i<notas.length;i++){
			//Math.rint(Math.random()*10); sirve para redondear los decimales
			notas[i]=Math.random()*100;
			media+=notas[i];
			System.out.println("contenido del elemento con posicion " + 
			i + " es " + notas[i]);
			media/=notas.length;
			//ojo al uso del Math.rint
			media = Math.rint(media*100)/100;
		}
		System.out.println("\nLa media de las notas es " + media);
		System.out.println("\nEl año de nuestro señor es " + LocalDate.now().getYear());*/
		
		/*Crear un array de 100 enteros aleatorios y vamos a buscar el mayor y el menor*/
		//Math.rint redondea al mayor si es 7.88 = 8 un casting a int no, solo corta la parte decimal
		
		List<Integer> pepe = new ArrayList<Integer>();
		pepe.add(2);
		pepe.add(4);
		pepe.add(6);
		pepe.add(45);
		pepe.add(3);
		System.out.println(pepe);
		System.out.println("el primero es: " + pepe.get(0) + " el ultimo es : " + pepe.get(pepe.size()-1));
		for(int nuevo : pepe){
			System.out.println("numeros: " + nuevo);
		}
		List<String> amigos = new ArrayList<>();
		amigos.add("Juancho");
		amigos.add("Pepe");
		amigos.add("Antonio");
		amigos.add("Arrobo");
		System.out.println(amigos);
		System.out.println("primero de la lista " + amigos.get(0) + " ultimo de la lista " + amigos.get(amigos.size()-1));
		for(String unAmigo : amigos)
			System.out.println(unAmigo);
		//no funcniona
		/*if(amigos.contains(args[0])){
			System.out.println("Hola " + args[0] + " !");
		}*/
			
		int may, men;
		int numeros[] = new int[100];
		for(int i=0;i<numeros.length;i++){
			numeros[i]=(int)(Math.random()*999+1);
			System.out.println("numero " + (i+1) + " : " + numeros[i]);
		}
		may=men=numeros[0];//pone el primero como mayor y menor
		for(int indice=1;indice<numeros.length;indice++){
			if(numeros[indice]>may)
				may=numeros[indice];
			if(numeros[indice]<men)
				men=numeros[indice];
		}
		System.out.println("El menor es " + men);
		System.out.println("El menor es " + may);
	}

}
