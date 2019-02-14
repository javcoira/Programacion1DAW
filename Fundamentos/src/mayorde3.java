import java.util.Scanner;

public class mayorde3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b,c,mayor,medio,menor;
		System.out.println("Introduce numero: ");
		a = teclado.nextInt();
		System.out.println("Introduce numero: ");
		b = teclado.nextInt();
		System.out.println("Introduce numero: ");
		c = teclado.nextInt();
		mayor =a;
		/*2 formas de hacerlo con un numero establecido como menor o comparando cada valor*/
		/*if(a>b){
			if(a>c){
				System.out.println("mayor es " +a);
			}
			else{
				System.out.println("mayor es: "+c);
			}
		}
		else{
			if(b>c){
				System.out.println("mayor es: "+b);
			}
			else{
				System.out.println("mayor es: "+c);
			}
		}
		
		if(b > mayor){ //b es mayor que a
			mayor =b;
		}
		if(c > mayor){
			mayor = c;
		}
		System.out.println("el mayor es: " + mayor);*/
		
		/*ejercicio 2 Dados 3 numeros mostrarlos ordenados de mayor a menor*/
		/*if(a>b){ //a>b
			if(b>c){
				System.out.println(a + " " + b + " " + c);
			}
			else{
				if(a>c){
					System.out.println(a + " " + c + " " + b);
				}
				else{
					System.out.println(c + " " + a + " " + b);
				}
			}
			
		}
		else{
			if(b>c){
				if(c>a){
					System.out.println(b + " " + c + " " + a);
				}
				else{
					System.out.println(b + " " + a + " " + c);
				}
			}
			else{
				System.out.println(c + " " + b + " " + a);
			}
		}*/
		
		/*ejercicio 2 Dados 3 numeros mostrarlos ordenados de mayor a menor otra version condiciones conpuestas*/
		if(a>=b && a>=c){
			mayor=a;
			if(b>=c){
				medio=b;
				menor=c;
			}else{
				medio=c;
				menor=b;
			}
		}else if(b>=a && b>=c){
			mayor=b;
			if(a>=c){
				medio=a;
				menor=c;
			}else{
				medio=c;
				menor=a;
			}
		}else{
			mayor=c;
			if(a>=b){
				medio=a;
				menor=b;
			}else{
				medio=b;
				menor=a;
			}
		}
		System.out.println("Mayor " + mayor + " Medio " + medio + " Menor " + menor);
	}

}
