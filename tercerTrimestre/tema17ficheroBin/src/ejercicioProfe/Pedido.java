package ejercicioProfe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pedido {

	public static void main(String[] args) throws IOException {
		double[] precios= {1,1.44,8,90,62};
		int[] unidades= {5,7,12,8,30};
		String[] descripciones= {"paquetes","lapices","boligrafos","carteras","mesas"};
		double totalFact=0;
		
		//escribir en el fichero
		DataOutputStream salida = new DataOutputStream(new FileOutputStream("c:\\adb\\pedidos.dat"));
		DataInputStream entrada = new DataInputStream(new FileInputStream("c:\\adb\\pedidos.dat"));
		
		//bucle recorrer los arrays
		for(int i=0;i<precios.length;i++) {
			salida.writeUTF(descripciones[i]);
			salida.writeInt(unidades[i]);
			salida.writeDouble(precios[i]);
		}
		
		salida.close();
		String descripcion;
		double precio;
		int cantidad;
		
		while(entrada.available()>0) {
			descripcion=entrada.readUTF();
			cantidad=entrada.readInt();
			precio=entrada.readDouble();
			System.out.println(descripcion+ " cantidad " + cantidad + " precio unidad " + precio);
			totalFact+=cantidad*precio;
		}
		entrada.close();
		System.out.println("Total factura: " + totalFact);
	}

}
