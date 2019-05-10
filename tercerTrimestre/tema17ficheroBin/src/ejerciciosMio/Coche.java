package ejerciciosMio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Coche {
	public static void main(String[] arg) {
		FileOutputStream fs = null;
		DataOutputStream salida = null;
		double temp;
		
		try {
			fs = new FileOutputStream("c:\\adb\\coche.dat",true);
			salida = new DataOutputStream(fs);
			
			String cadena=JOptionPane.showInputDialog("Introduce tu matricula: ");
			//JOptionPane.showMessageDialog(null, cadena);
			
			salida.writeUTF(cadena);
			
			String cadena2=JOptionPane.showInputDialog("Introduce tu marca: ");
			//JOptionPane.showMessageDialog(null, cadena2);
			
			salida.writeUTF(cadena2);
			
			String cadena3=JOptionPane.showInputDialog("Introduce tu deposito: ");
			//JOptionPane.showMessageDialog(null, cadena3);
			//temp = Double.
			salida.writeUTF(cadena3);
			
			String cadena4=JOptionPane.showInputDialog("Introduce tu modelo: ");
			//JOptionPane.showMessageDialog(null, cadena4);
			
			salida.writeUTF(cadena4);
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				//cerramos los archivos
				if(fs != null) {
					fs.close();
				}
				if(salida != null) {
					salida.close();
				}
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
