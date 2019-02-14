package ejercap13;

public class testMiTele {

	public static void main(String[] args) {
		
		MiTele mt = new MiTele(300,3,true);
		
		mt.apagar();
		
		System.out.println(mt.toString());
		
		mt.cambiarCanal(3001);
		
		System.out.println(mt.toString());
		
		mt.cambiarCanal(245);
		mt.encender();
		
		System.out.println(mt.toString());

	}

}
