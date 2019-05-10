package ejerciciosMio.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import ejercicioProfe.serializable.Persona;

public class SerialEmpleado {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Empleado e;
	
		try {
			fos=new FileOutputStream("c:\\adb\\empleado.txt");
			salida = new ObjectOutputStream(fos);
			for(int i=0;i<3;i++) {
				String nif=JOptionPane.showInputDialog("pon nif");
				String nombre=JOptionPane.showInputDialog("pon nombre");
				String sedad = JOptionPane.showInputDialog("pon la edad");
				int edad = Integer.parseInt(sedad);
				String ssueldo=JOptionPane.showInputDialog("pon sueldo");
				double sueldo = Double.parseDouble(ssueldo);
				//crear objeto de tipo empleado y asignarle los valores leidos
				e=new Empleado(nif,nombre,edad,sueldo);
				//crear un objeto de tipo empledo y escribirlo en el documento
				salida.writeObject(e);
			}
		
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
