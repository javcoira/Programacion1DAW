package ejercicioProfe.fecha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class leerAlumnosSerial {

	public static void main(String[] args) {
		//los inicializamos a null para luego poder parar la lectura
		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Alumno a;
		Fecha f;
		try {
			fis=new FileInputStream("c:\\adb\\alumnoFecha.dat");
			entrada = new ObjectInputStream(fis);
			while(true) {
				a=(Alumno) entrada.readObject();
				System.out.println(a.toString());
			}
		}catch(IOException ex) {
			System.out.println("fin");
		}catch(ClassNotFoundException ex) {
			System.out.println("clase alumno o fecha no definida");
		}finally {
			try {
				if(fis!=null)
					fis.close();
				if(entrada!=null)
					entrada.close();
			}catch(IOException ex) {
				System.out.println(ex);
			}
		}
	}

}
