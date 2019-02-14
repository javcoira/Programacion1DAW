package argumentosVariables;

public class calculaSuper {
/*si dejas el int area fuera como variable global debajo de calculaSuper, dentro de los case
 * no se podra hacer el area=l[0] sino que se debera poner directamente en el sysout
 */
	static void superficie(int... l) {
		int area;
		switch(l.length) {
		case 0: 
			System.out.println("no se puede calcular");
			break;
		case 1:
			area = l[0]*l[0];
			System.out.println("area de un cuadrado es " + area);
			break;
		case 2:
			area = l[0]*l[1];
			System.out.println("area de un rectangulo es " + area);
			break;
		default:
			System.out.println("Poligono irregular integral");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superficie();
		superficie(3);
		superficie(3,6);
		superficie(3,2,4,1,2);
	}

}
