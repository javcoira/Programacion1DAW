package excepciones;

public class useFinally {

	public static void genException(int valor) {
        int t;
        int nums[] = new int[2];
        System.out.println("Receiving " + valor);
        try {
            switch (valor) {
                case 0:
                    t = 10 / valor; // Genera divisi�n por 0
                    break;
                case 1:
                    nums[4] = 4; // Genera error de �ndice
                    break;
                case 2:
                    System.out.println("Una ejecuci�n normal, sin error");
                    break;
                case 3:
                    return; // Sale del bloque try-catch
            }
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by Zero!");
            return; // sale del m�todo
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
        } finally {
            //Siempre se ejecuta aunque haya un return
            System.out.println("SIEMPRE PASA POR AQU� AUNQUE HAYA UN RETURNR ANTES (Case 0)");
        }
        System.out.println("Others"); //Siempre se ejecuta a no ser que haya un return previo
    }
}

