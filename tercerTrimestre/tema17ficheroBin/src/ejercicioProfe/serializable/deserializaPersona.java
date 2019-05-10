package ejercicioProfe.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deserializaPersona {

	//estamos copiando un grupo de bytes de clase no byte a byte
	public static void main(String[] args) {
		FileInputStream fis =null;
		ObjectInputStream entrada = null;
		Persona p;
		try {
			fis=new FileInputStream("c:\\adb\\personas.txt");
			entrada = new ObjectInputStream(fis);
			while(true) {
				p=(Persona) entrada.readObject();
				System.out.println(p.toString());
			}
		}catch(ClassNotFoundException exc) {
			System.out.println("1 " + exc.getMessage());
		}catch(FileNotFoundException exc) {
			System.out.println("2 " + exc.getMessage());
		}catch(IOException exc) {
			System.out.println("3 " + exc.getMessage());
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
				if(entrada!=null)
					entrada.close();
			}catch(IOException exc) {
				System.out.println(exc.getMessage());
			}
		}
	}
}
