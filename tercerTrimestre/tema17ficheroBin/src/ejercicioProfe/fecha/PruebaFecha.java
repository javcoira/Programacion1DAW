package ejercicioProfe.fecha;

import javax.swing.JOptionPane;

public class PruebaFecha {

	public static void main(String... args) {
		String dia = JOptionPane.showInputDialog("introduce dia");
		String mes = JOptionPane.showInputDialog("introduce mes");
		String anio = JOptionPane.showInputDialog("introduce anio");
		Fecha f =new Fecha(Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(anio));
		
		System.out.println(f.toString());
		
		Alumno Al = new Alumno("Y3432656","Pepe",23,f);
		System.out.println(Al.toString());
	}
}
