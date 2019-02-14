package capitulo9;

public class testPassword {

	public static void main(String[] args) {
		Password p1 = new Password();
		Password p2 = new Password(10);
		
		System.out.println("clave de longitud 8 : "+ p1.getClave());
		System.out.println("clave de longitud 10 : " + p2.getClave());
		
		int tam = 15;
		/*listas paralelas de password y para comprobar si son fuertes o no*/
		Password listaPassword[] = new Password[tam];
		boolean fortalezaPassword[] = new boolean[tam];
		for(int i=0;i<listaPassword.length;i++){
			listaPassword[i] = new Password(10);
			fortalezaPassword[i] = listaPassword[i].esFuerte();
			System.out.println(listaPassword[i].getClave()+ " " + fortalezaPassword[i]);
		}

	}

}
