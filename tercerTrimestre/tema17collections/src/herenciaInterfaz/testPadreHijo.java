package herenciaInterfaz;

public class testPadreHijo {

	public static void main(String[] args) {
		Padre p1,p2,p3;
		Hijo h1,h2;
		
		//el padre se puede pasar a hijo pero el hijo a padre NO
		p1=new Padre("Pepe",34);
		p2=new Padre("Juan",45);
		p3=new Padre("Mario",66);
		//Hijo h1 = new Hijo("asdasd",43,1.34);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.getClass());
		System.out.println("El mayor de los 2 padres es: " + p1.mayor(p2).toString());
		 p1 = new Hijo("Alberto",12,1.92);
		 p2 = new Hijo("Felix",8,1.06);
		 p3 = new Hijo("Alex",24,1.80);
		 // Nota:
		 // aunque p1 se pueda pasar al tipo Hijo no se cambia al tipo hijo por eso no podemos hacer p1.getAltura
		 // debemos fijarnos en lo que dice Padre al incio 
		// h1 = new Padre("ersdf",34);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.getClass());
		System.out.println("El mayor de los 2 hijos es (segun el metodo mayor de objetos de tipo Padre): " + p1.mayor(p3));
		h1=new Hijo("ana", 13, 1.85);
		h2=new Hijo("carlota",14,1.55);
		System.out.println("El mayor de los 2 hijos es (segun el metodo mayor de objetos de tipo Hijo): " + h1.mayor(h2));
	}

}
