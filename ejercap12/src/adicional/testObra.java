package adicional;

public class testObra {

	//ojo a que se pueden crear un objeto de difererntes formas ya que existe la version con autor anonimo
	//o sin autor ni titulo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obra o1=new Obra("cien años de soledad","Grabriel Garcia Maquez");
		System.out.println(o1.toString());
		Libro l1=new Libro("cien años de soledad","Grabriel Garcia Maquez",3);
		System.out.println(l1.toString());
		Cuadro c1=new Cuadro(3,4);
		System.out.println(c1.toString());
		Cuadro c2=new Cuadro("DaVinci",3,4);
		System.out.println(c2.toString());
		Cuadro c3=new Cuadro("El Grito","Munch",3,4);
		System.out.println(c3.toString());
		Libro l2 = new Libro(o1.getTitulo(),o1.getAutor(),400);
		System.out.println(l2.toString());
	}

}
