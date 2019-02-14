package ejemploscap9;

public class TestProfesor {

	public static void main(String[] args) {
		Profesor pf1 = new Profesor();
		System.out.println(pf1.toString());
		
		pf1.setNombre("Andres");
		pf1.setApellidos("Recalde Porteño");
		pf1.setEdad(44);
		pf1.setEspecialista(false);
		System.out.println(pf1.toString());
		
		Profesor pf2 = new Profesor("Pepe", "Peronio Camaras", 45, true);
		System.out.println(pf2.toString());
		
		System.out.println("nombre : " + pf2.getApellidos() + " \nedad : " + pf2.getEdad());
		
	}

}
