package ejerciciosMio.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import ejercicioProfe.serializable.Persona;

public class deserialEmpleado {

	public static void main(String[] args) {
			FileInputStream fis =null;
			ObjectInputStream entrada = null;
			Empleado e;
			try {
				fis=new FileInputStream("c:\\adb\\empleado.txt");
				entrada = new ObjectInputStream(fis);
				while(true) {
					e=(Empleado) entrada.readObject();
					System.out.println(e.toString());
				}
			}catch(ClassNotFoundException exc) {
				System.out.println("1 " + exc.getMessage());
			}catch(FileNotFoundException exc) {
				System.out.println("2 " + exc.getMessage());
			}catch(IOException exc) {
				System.out.println();
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
