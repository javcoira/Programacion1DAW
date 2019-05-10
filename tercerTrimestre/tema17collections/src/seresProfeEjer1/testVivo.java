package seresProfeEjer1;

public class testVivo {

	public static void main(String[] args) {
		SerVivo x,y;
		x = new SerVivo((byte)5);
		y = new SerVivo((byte)3);
		Humano h;
		System.out.println("El mayor es: " + x.mayor(y));
		x= new Humano((byte)34,"Homero");
		y= new Humano((byte) 9,"Bartolomeo");
		System.out.println("El humano mayor es " + x.mayor(y));
		h=(Humano)x.mayor(y);
		if(h.equals(x)) {
			System.out.println("El menor es " + y);
		}else
			System.out.println("menor es " + x);
		
	}

}
