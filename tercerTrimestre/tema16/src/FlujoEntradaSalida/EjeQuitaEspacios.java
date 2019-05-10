package FlujoEntradaSalida;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjeQuitaEspacios {
	public static void main(String[] args) {
	try {
		// Abro stream, crea el fichero si no existe
		FileWriter fw = new FileWriter("c:\\adb\\prueba1.txt");
		
		// Abro el stream, el fichero debe existir
		FileReader fr = new FileReader("c:\\adb\\prueba.txt");
		
		// Leemos el fichero y lo mostramos por pantalla
		int valor = fr.read();		//-1 marca finde texto en docuemento
		while (valor != -1) {
			if((char)(valor) != ' ' && (char)(valor) != '\n') {
				fw.write(valor);
			}
			valor = fr.read();
		}
		
		/*while(i=fr.read()!=-1){
		 *  char caract = (char) i;
		 *  }
		 */
		
		// Cerramos el stream
		fr.close();
		fw.close();
		
	} catch (IOException e) {
		System.out.println("Error E/S: " + e);
	}finally {
		System.out.println("fin, ver el fichero ");
	}
}
}
