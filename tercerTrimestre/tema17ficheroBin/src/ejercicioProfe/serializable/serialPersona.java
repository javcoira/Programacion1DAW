package ejercicioProfe.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class serialPersona {

	public static void main(String[] args) {
		//escribir un fichero de objetos de tipo persona
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Persona p;
		try {
			fos=new FileOutputStream("c:\\adb\\personas.txt");
			salida = new ObjectOutputStream(fos);
			p=new Persona("123A","pepe perez",34);
			salida.writeObject(p);
			p=new Persona("33A","pedro piron",24);
			salida.writeObject(p);
			p=new Persona("223J","maria lopez",44);
			salida.writeObject(p);
		}catch(FileNotFoundException exc) {
			System.out.println("1 " + exc.getMessage());
		}catch(IOException exc) {
			System.out.println("2 " + exc.getMessage());
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				if(salida!=null)
					salida.close();
			}catch(IOException exc) {
				System.out.println(exc.getMessage());
			}
		}
	}
}
