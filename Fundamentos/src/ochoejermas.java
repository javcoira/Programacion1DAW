import java.io.IOException;
import java.util.Scanner;

public class ochoejermas {

	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		int num3;
		int res = 0;
		String nombre;
		char ch;
		int a;
		int b;
		double longitud;
		double perimetro;
		int radio;
		double area;
		
		
		Scanner scanner = new Scanner(System.in);

		/*//Pedimos el valor del numero y del multiplo a buscar
		System.out.println("Ingresa el primer valor: ");
		num1 = scanner.nextInt();
		
		System.out.println("Ingresa el segundo valor: ");
		num2 = scanner.nextInt();
		
		System.out.println("Ingresa tu nombre: ");
		nombre = scanner.nextLine();
		
		System.out.println("Los numeros leidos son: " + num1 + " y " + num2 + " y su suma es: " + (num1+num2));
		System.out.println("tu nombre es: " + nombre);*/
		
		/*ejercicio 2
		System.out.println("Ingresa el radio de la circunferencia: ");
		num1 = scanner.nextInt();
		
		perimetro = (2 * 3.1416 * num1);
		longitud = perimetro * (2*num1);
		area = (3.1416 * (perimetro * perimetro));
		
		System.out.println("el permitro es : " + perimetro + " la longitud es : " + longitud + " el area es : " + area);
		*/
		
		/*ejercicio 3
		System.out.println("Ingresa el valor de 3 cifras: ");
		num1 = scanner.nextInt();
		System.out.println("el primer valor de los numeros es: " + num1/100);
		a=num1%100;
		System.out.println("el segundo valor de los numeros es: " + a/10);
		b=a%10;
		System.out.println("el tercer valor de los numeros es: " + b/1);*/
		
		/*ejercicio4
		System.out.println("Ingresa el valor de 5 cifras: ");
		num1 = scanner.nextInt();
		System.out.println(num1/10000);
		System.out.println(num1/1000);
		System.out.println(num1/100);
		System.out.println(num1/10);
		System.out.println(num1/1);
		*/
		
		/*ejericio5
		System.out.println("Ingresa tu dia de nacimiento: ");
		num1 = scanner.nextInt();
		System.out.println("Ingresa tu mes de nacimiento: ");
		num2 = scanner.nextInt();
		System.out.println("Ingresa tu año de nacimiento: ");
		num3 = scanner.nextInt();
		a = (num1+num2+num3);
		b = a/1000;
		a %=1000;
		b += (a/100);
		a %=100;
		b += (a/10);
		a %= 10;
		b += (a/1);
		res = b;
		System.out.println("Tu numero de la suerte es: " + (num1+num2+num3) + " sumamos los valores: " + res );*/
		
		/*ejericio 6 Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
		System.out.print("Type a character: "); 
		num1 = (int) System.in.read(); // get a char 
		if(num1>=65 && num1<=90)
			System.out.println("Tu caracter esta en Mayusculas: " + (char)num1);
		else if(num1>=97 && num1<=122)
			System.out.println("Tu caracter esta en Minusculas: " + (char)num1);
		else
			System.out.println("No es una letra! " + (char)num1);*/
		
		/*ejericio7 El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres
		System.out.println("Ingresa numero1: ");
		num1 = scanner.nextInt();
		System.out.println("Ingresa numero2: ");
		num2 = scanner.nextInt();
		System.out.println("Ingresa numero3: ");
		num3 = scanner.nextInt();
		if(num1>=num2){
			if(num1>=num3)
				System.out.println("El numero mas grande es: " + num1);
		}
		else if(num2>=num3){
				System.out.println("El numero mas grande es: " + num2);
		}
		else
			System.out.println("El numero mas grande es: " + num3);*/
		
		/*Ejercicio16. Programa que lea por teclado tres números enteros H, M, S 
		 * correspondientes a hora, minutos y segundos respectivamente,
		 *  y comprueba si la hora que indican es una hora válida. */
	
		
		
		
		/*Ejercicio17. Programa que lea una variable entera mes y compruebe si el valor 
		 * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero
		 *  tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el 
		 *  valor introducido esté comprendido entre 1 y 12.*/
		
		/*Escribe un programa que pregunte al usuario si desea calcular el área de un rectángulo (‘r’) 
		 * o el área de un cuadrado (‘c’). En el primer caso, se le solicitarán los valores correspondientes 
		 * a la base y altura del rectángulo y se mostrará a continuación el resultado de calcular 
		 * el área correspondiente; en el segundo caso, se pedirá el valor correspondiente al lado del cuadrado y 
		 * se mostrará posteriormente el resultado de calcular su área.
		 */
		System.out.println("Ingresa 'r' si quieres calcular el area de rectangulo o 'c' de un cuadrado: ");
		/*ojo a como se asigna para leer solo un carater*/
		ch = (char) scanner.next().charAt(0); // no existe nextChar() 
		if(ch=='r'){
			System.out.println("Ingresa la base y la altura en metros: ");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			System.out.println("El area del rectangulo es: " + (num1*num2) + " metros");
		}
		else if(ch=='c'){
			System.out.println("Ingresa el lado del cuadrado en metros: ");
			num1 = scanner.nextInt();
			System.out.println("El area del cuadrado es: " + (num1*num1) + " metros");
		}
		else
			System.out.println("No has elegido r o c");
	}
}
