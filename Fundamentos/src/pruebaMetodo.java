
public class pruebaMetodo {

	public static void main(String[] args) {
		int num1, num2, i;
		for(i=0;i<10;i++){
			num1=(int)Math.round(Math.random()*99+1);
			num2=(int)Math.round(Math.random()*99+1);
			System.out.println("los numeros son " + num1 + " y " + num2);
			System.out.println(" su suma es " + suma(num1,num2));
		}

	}
	
	private static int suma(int n1, int n2){
		return n1+n2;
	}

}
