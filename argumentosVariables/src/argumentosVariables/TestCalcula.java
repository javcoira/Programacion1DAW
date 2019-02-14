package argumentosVariables;

public class TestCalcula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* al ser static no se debe instanciar objeto como esta abajo
		calcula m1 = new calcula();
		System.out.println("primero es : " + m1.mayor());		*/
		
		System.out.println("int 2 valores el mayor es: " + calcula.mayor(2,3));
		//ojo que para los static los floats se usa f al final
		System.out.println("float 3 valores el mayor es: " + calcula.mayor(-2.4f,5.3f,6.5f));
		System.out.println("mayor longitud de texto es: " + calcula.mayor("pon","mayor","nuevos","carretilla"));
	}


}
