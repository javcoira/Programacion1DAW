package ejerciciosMio;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerCoche {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream entrada = null;
		String n=" ";
		try {
			fis = new FileInputStream("c:\\adb\\coche.dat");
			entrada = new DataInputStream(fis);
			while (true) {
				n = entrada.readUTF(); // se lee un entero del fichero
				System.out.println(n); // se muestra en pantalla
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (EOFException e) {
			System.out.println("Fin de fichero");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
