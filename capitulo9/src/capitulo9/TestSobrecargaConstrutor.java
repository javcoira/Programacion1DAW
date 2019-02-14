package capitulo9;

public class TestSobrecargaConstrutor {

	public static void main(String[] args) {
		ConstructorSobrecarga ob1=new ConstructorSobrecarga();
		System.out.println("valor : " + ob1.getX());
		ConstructorSobrecarga ob2=new ConstructorSobrecarga(5);
		System.out.println("valor : " + ob2.getX());
		ConstructorSobrecarga ob3=new ConstructorSobrecarga(4.67);
		System.out.println("valor : " + ob3.getX());
		ConstructorSobrecarga ob4=new ConstructorSobrecarga(5,4);
		System.out.println("valor : " + ob4.getX());

	}

}
