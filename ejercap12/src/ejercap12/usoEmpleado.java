package ejercap12;

public class usoEmpleado {
	public static void main(String[] args) {
		Operario d1=new Operario("juan");
		System.out.println(d1.toString());
		Directivo e1=new Directivo("pepe");
		System.out.println(e1.toString());
		Oficial of1=new Oficial("marta");
		System.out.println(of1.toString());
		Tecnico tn1=new Tecnico("pepe2");
		System.out.println(tn1.toString());
	}

}
