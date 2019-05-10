
public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*10+1);
		try {
			System.out.println("Antes de la exception");
			if(n%2==0) throw new ArithmeticException("Mi mensaje de error");
			//throw new Throwable
			System.out.println("el numero fue " + n);
			//catch Throwable
		}catch(ArithmeticException exc) {
			System.out.println("el numero era " + n + " conseguido");
			//exc.printStackTrace();
		}
		System.out.println("Despues de try/catch");
	}

}
