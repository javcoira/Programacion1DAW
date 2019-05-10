package FlujoEntradaSalida;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CambioLetras {

	public static void cambioE(FileWriter fw, FileReader fr) throws IOException {
		int valor=fr.read();
        while(valor!=-1){
           if((char)valor=='e') {
        	   valor=(char)('E');
        	   //fw.write('E');
           }
           fw.write(valor);
           valor=fr.read();
        }
	}
	
	public static void leeFichero(FileReader fr) throws IOException{
		int valor=fr.read();
        while(valor!=-1){
            System.out.print((char)valor);
            valor=fr.read();
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce nombre de archivo:  ");
		String archivo= sc.next();
		try {
			FileReader fr = new FileReader("c:\\adb\\"+archivo); 
			leeFichero(fr);
			FileWriter fw = new FileWriter("c:\\adb\\"+archivo);
			cambioE(fw, fr);
			 fw.flush();
			leeFichero(fr);
		}catch(IOException ex) {
			System.out.println("error de E/S" + ex);
		}
	}

}
