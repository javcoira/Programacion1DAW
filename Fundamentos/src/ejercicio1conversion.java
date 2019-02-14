
public class ejercicio1conversion {

	public static void main(String[] args) {

		int a = 8;
		int b = 3;
		int c = -5;
		int d;
		int cambioVariable;
		char c1 = 'E';
		char c2 = '5';
		char c3 = '?';
		
		int N = 3;
		double A = 3.33;
		char C = 'H';
		
		System.out.println("a + b + c = " + (a + b + c));
		System.out.println("b " + (2 * b + 3 * (a - c)));
		System.out.println("c " + (a / b) );
		System.out.println("d " + ( a % b) );
		System.out.println("e " +  (a / c) );
		System.out.println("f " + (a % c) );
		System.out.println("g "+ (a * b / c));
		System.out.println("h " +  (a * (b / c)));
		System.out.println("i " +  ((a * c) % b));
		System.out.println("j " + (a * (c % b) ));
		System.out.println("k " + (3 * a - 2 * b) % (2 * a - c));
		System.out.println("l "+ ( 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.println("m "+ ((a - 3 * b) % (c + 2 * a) / (a - c)) );
		System.out.println("o " + (a - b - c * 2));

		System.out.println("c1 es " + c1 + " y su codigo ascii es : " + (int)c1);
		System.out.println("c1 es " + c2 + " y su codigo ascii es : " + (int)c2);
		System.out.println("c1 es " + c3 + " y su codigo ascii es : " + (int)c3);
		
		System.out.println("a) c1 + 1 = " + (c1+1) + " su caracter es:  " +  (char)(c1+1));
		System.out.println("b) c1 – c2 + c3 = " + (c1 - c2 + c3) + " su caracter es:  " +  (char)(c1 - c2 + c3));
		System.out.println("c) c2 – 2 = " + (c2 - 2)  + " su caracter es:  " +  (char)(c2 - 2));
		System.out.println("d) c2 – '2' = " + (c2 - '2')  + " su caracter es: " +  (char)(c2 - '2'));
		System.out.println("e) c3 + '#' = " + (c3 + '#')  + " su caracter es: " +  (char)(c3 + '#'));
		System.out.println("f) '2' + '2' = " + ('2' + '2')  + " su caracter es: " +  (char)('2' + '2'));
		System.out.println("g) (c1 / c2) * c3 = " + ((c1 / c2) * c3)  + " su caracter es: " +  (char)((c1 / c2) * c3));
		System.out.println("h) 3 * c2 = " + (3 * c2)  + " su caracter es: " +  (char)(3 * c2));
		System.out.println("i) '3' * c2 = " + ('3' * c2)  + " su caracter es: " +  (char)('3' * c2));

		System.out.println("el valor de N es "+ N + " el valor de A es " + A + " el valor de C es " + C);
		System.out.println("la suma de N + A es " + ((double)N+A));
		System.out.println("la diferencia es A - N es " + (A-(double)N));
		System.out.println("El valor numerico de C es " + (int)C);
		
		/*
		ejrcicio4.Escribe un programa Java que declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:
		Incrementar N en 77.
		Decrementarla en 3.
		Duplicar su valor.*/
		N=2;
		N +=77;
		System.out.println("Incrementar N en 77: " + N);
		N -= 3;
		System.out.println("Decrementar N en 3: " + N);
		N *= 2;
		System.out.println("Duplicar N por 2: " + N);
		
		
		
		/*Ejercicio5.Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:
		B tome el valor de C
		C tome el valor de A
		A tome el valor de D
		D tome el valor de B*/
		
		a=1;
		b=2;
		c=3;
		d=4;
		cambioVariable = b;
		b=c;
		c=a;
		a=d;
		d=cambioVariable;
		System.out.println("los nuevos valores de las variables son a: " + a);
		System.out.println("los nuevos valores de las variables son b: " + b);
		System.out.println("los nuevos valores de las variables son c: " + c);
		System.out.println("los nuevos valores de las variables son d: " + d);
		
		
		
		/*ejercicio6.Escribe un programa java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo.*/ 
		b=5;
		if(b>=0){
			System.out.println("el valor de a es postivo");
		}
		else
			System.out.println("el valor de a es negativo");
		
		
		
		
		/*Ejercicio7.Escribe un programa java que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. 
		Si por ejemplo C = 55 la salida será
		55 es positivo
		55 es impar
		55 es múltiplo de 5
		55 no es múltiplo de 10
		55 es menor que 100*/
		
		c=55;
		if(c>=0){
			System.out.println(c + " Es positivo");
		}
		else
			System.out.println(c + " Es negativo");
		if(c%2==0){
			System.out.println(c + " Es par");
		}
		else
			System.out.println(c + " Es impar");
		if(c%5==0){
			System.out.println(c + " Es multiplo de 5");
		}
		else
			System.out.println(c + " No es multiplo de 5");
		if(c%10==0){
			System.out.println(c + " Es multiplo de 10");
		}
		else
			System.out.println(c + " No es multiplo de 10");
		if(c<100){
			System.out.println(c + " Es menor que 100");
		}
		else
			System.out.println(c + " Es mayor que 100");
		
		
			

		
	}

}
