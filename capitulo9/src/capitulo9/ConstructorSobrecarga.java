package capitulo9;

public class ConstructorSobrecarga {

	private int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public ConstructorSobrecarga() {
        System.out.println("Inside MyClass().");
        x = 0;
    }
	public ConstructorSobrecarga(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }
    public ConstructorSobrecarga(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d*100;
    }
    public ConstructorSobrecarga(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;

    }
}