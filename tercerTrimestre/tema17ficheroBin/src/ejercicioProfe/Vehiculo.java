package ejercicioProfe;

import javax.swing.*;
import java.io.*;

public class Vehiculo {
	
public static void introduceDatos (DataOutputStream s,String matricula,String marca,double tamcc,String modelo) throws IOException{
		s.writeUTF(matricula);
		s.writeUTF(marca);
		s.writeDouble(tamcc);
		s.writeUTF(modelo);
}
	
public static void muestraDatos(DataInputStream entrada) throws IOException{
	while (entrada.available()>0) {
	//while(true){
		JOptionPane.showMessageDialog(null,"matricula: "+entrada.readUTF()+
				" marca "+entrada.readUTF() + " cc "+entrada.readDouble()+
				" modelo "+entrada.readUTF());
	}
}
	public static void main(String[] args) {
		final String ruta="c:\\adb\\vehiculos.dat";
		String matricula=JOptionPane.showInputDialog("pon matricula");
		String marca=JOptionPane.showInputDialog("pon marca");
		String cc=JOptionPane.showInputDialog("pon tamaño");
		double tamcc=Double.parseDouble(cc);
		String modelo=JOptionPane.showInputDialog("pon modelo");
		try {
			DataOutputStream escribir=new DataOutputStream
					(new FileOutputStream(ruta,true));
			DataInputStream leer=new DataInputStream
					(new FileInputStream(ruta));
			introduceDatos(escribir,matricula,marca,tamcc,modelo);
			muestraDatos(leer);
			escribir.close();
			leer.close();
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null," error "+e.getMessage());
		}
	}
}
