package prueba;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ejemplo {

	public static void main(String[] args) throws IOException {
		/*boolean cond = false;
		a: {
			b: {
				c: {
					System.out.println("Antes de break");
					if (cond)
						break c;
					else
						break b;
					// System.out.println(”No se ejecutaria nunca”);
				}
				System.out.println("Esto se ejecuta si cond true");
			}
			System.out.println("Después de b, se ejecuta siempre");
			*/
	
	
			/*for (int i = 0; i < 10; i++) {
				System.out.println(i + " ");
				if (i % 2 == 0)
					continue;
				System.out.println();
			}
			
			BufferedReader buffer =new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));*/
		
		/*String codigoPostal = JOptionPane.showInputDialog("Código Postal de Madrid:");
		int cp = Integer.parseInt(codigoPostal);
		
			while (cp < 28000 || 28999 < cp) { 
				System.out.println("C.P."+codigoPostal+"incorrecto"); 
				codigoPostal = JOptionPane.showInputDialog("Código postal de Madrid:"); 
				cp = Integer.parseInt(codigoPostal);
			}
			System.out.println("C.P. " + codigoPostal + " OK.");*/
		
		System.out.println("Introduce numero ");
		int i = System.in.read();
		boolean par = i % 2 == 0;
		System.out.println( (par || !par) ? 5 : 2.5 );
	}
}


