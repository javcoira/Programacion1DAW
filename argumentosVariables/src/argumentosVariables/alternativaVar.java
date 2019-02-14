package argumentosVariables;

public class alternativaVar {

	static void superf() {
		System.out.println("sin datos sin area");
	}
	
	static void superf(int l) {
		System.out.println("area de un cuadrado de lado " + l + " es " + l*l);
	}
	
	static void superf(int l1 ,int l2) {
		System.out.println("area de un rectangulo de lados " + l1 + " y " + l2 + " es " + l1*l2);
	}
	
	static void superf(int l1,int l2, int l3) {
		System.out.println("area de un area irregular de lado " + l1 + " y " + l2 + " y " + l3 + " se calula mediante integrales");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superf();
		superf(2);
		superf(3,4);
		superf(5,3,1);
	}

}
