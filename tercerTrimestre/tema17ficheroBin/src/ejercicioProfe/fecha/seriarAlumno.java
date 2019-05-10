package ejercicioProfe.fecha;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class seriarAlumno {

	public static void main(String[] args) throws IOException {
		//lo ponemos a null para poder controlarlo
		FileOutputStream fos = null;
		fos=new FileOutputStream("c:\\adb\\alumnoFecha.dat");
		ObjectOutputStream salida;
		salida = new ObjectOutputStream(fos);
		Alumno a;
		Fecha f;
		String dia,mes,anio,nombre,edad,nif;
		String numero=JOptionPane.showInputDialog("introduce cuantos: ");
		int vueltas = Integer.parseInt(numero);
		try {
			for(int i=0;i<vueltas;i++) {
				System.out.println("datos de la fecha de matricula: ");
				dia =JOptionPane.showInputDialog("introduce dia: ");
				mes =JOptionPane.showInputDialog("introduce mes: ");
				anio =JOptionPane.showInputDialog("introduce anio: ");
				f=new Fecha(Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(anio));
				System.out.println("datos del alumno:  ");
				nombre =JOptionPane.showInputDialog("introduce nombre: ");
				edad =JOptionPane.showInputDialog("introduce edad: ");
				nif =JOptionPane.showInputDialog("introduce nif: ");
				a = new Alumno(nif,nombre,Integer.parseInt(edad),f);
				salida.writeObject(a);
			}
		}catch(IOException exc) {
			System.out.println(exc);
		}catch(NumberFormatException exc) {
			System.out.println(exc);
		}finally {
			try {
				if(fos!=null)
					fos.close();
				if(salida != null)
					salida.close();
			}catch(IOException ex) {
				System.out.println(ex);
			}
		}
		
	}

}
