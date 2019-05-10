package excepciones;

public class Ejemplo7 {

	public static void main(String[] args) {
		int n=(int)(Math.random()*10+1);
		 try {
	            System.out.println("Antes de la excepción");
	            if (n%2==0) throw new ArithmeticException("Mi mensaje de error");
	            System.out.println("el numero fue "+n);
	            //throw new ArithmeticException();

	        } catch (ArithmeticException exc) {
	            // catch the exception
	            exc.printStackTrace();
	        }
	        System.out.println("Después de try/catch");
	    }
	}