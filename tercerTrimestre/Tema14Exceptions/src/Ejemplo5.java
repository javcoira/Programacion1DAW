// try catch anidado 
public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerador[]= {4,8,16,32,64,128,256,512};
		int denominador[] = {2,0,4,4,0,8};
		
			try {
				for(int i=0;i<numerador.length;i++) {
					try {
						System.out.println(numerador[i] + " / " + denominador[i] + " is " + numerador[i] / denominador[i]);
					}catch (ArithmeticException exc) {
						System.out.println("no se puede dividir por 0");
					}
				}
				//este catch esta fuera del try del for por lo que cuando llega aqui ya no puede volver a entrar, este try esta en el exterior del anterior, se propaga si no puede controlarlo 
				//con el try interior
			}catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("error fatala programa termindo");
			}
		}

}
