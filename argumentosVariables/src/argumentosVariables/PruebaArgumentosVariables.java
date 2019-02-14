package argumentosVariables;

public class PruebaArgumentosVariables {

	/*vector de ints, tendra varios valores, se saben los paramentros en tiempo de ejecucion, no
	 * como en los strings que es en tiempo de compilacion*/
	static void vTest1(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("primera llamada sin argumentos ");
		vTest1();
		System.out.println("una llamada con 2 argumentos ");
		vTest1(3,34);
		System.out.println("una llamada con 4 argumentos ");
		vTest1(3,4,15,-3);
	}

}
