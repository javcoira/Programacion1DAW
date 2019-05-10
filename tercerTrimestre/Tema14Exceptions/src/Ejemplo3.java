
public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerador[]= {4,8,16,32,64,128,256,512};
		int denominador[] = {2,0,4,4,0,8};
		for(int i=0;i<numerador.length;i++) {
			try {
				System.out.println(numerador[i] + " / " + denominador[i] + " is " + numerador[i] / denominador[i]);
			}catch (ArithmeticException exc) {
				// esta se ejecutara en el bucle for cuando pase por los denomidaores que tengan un cero y despues NO pasa al siguiente catch 
				// sino que vuelve a empezar el FOR y vuleve a comprobar los catchs hasta terminar
				System.out.println("no se puede dividir por 0");
			}catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("No existe la celda " + i + " en denominador");
			}
			// si el for estuviera dentro del TRY y el catch despues solo se ejecutaria una vez ya que al encontrar el primer error pararia de ejecutar los demas 
		}
	}

}
