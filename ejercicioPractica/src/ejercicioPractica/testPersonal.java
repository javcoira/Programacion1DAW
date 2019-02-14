package ejercicioPractica;

public class testPersonal {

	public static void main(String[] args) {
		Estudiante e1= new Estudiante("pepe","perez","y34324324",Estado.otro,"1DAW");
		Profesor p1= new Profesor("Juan","Casa","Z3442342", Estado.casado,2006,23,"I+D");
		PersonalServicio per1=new PersonalServicio("Lucia", "Locolo", "z23434", Estado.viudo, 2018, 32,"Informatica");
		System.out.println(e1.imprimirInfoTotal());
		e1.matriculaEstudiante("2DAW");
		System.out.println(e1.imprimirInfoTotal());
		e1.cambioEstadoCivil(Estado.soltero);
		System.out.println(e1.imprimirInfoTotal());
		System.out.println();
		System.out.println(p1.imprimirInfoTotal());
		System.out.println(per1.imprimirInfoTotal());
		per1.reasignarDespacho(345);
		System.out.println(per1.imprimirInfoTotal());

	}

}
