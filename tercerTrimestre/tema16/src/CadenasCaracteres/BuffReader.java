package CadenasCaracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    	int cont=0;
        FileReader flujo = new FileReader("c:\\adb\\texto.txt");
         BufferedReader bR = new BufferedReader(flujo);
         String cadena;
         System.out.println("Contenido del fichero de cadenas: ");
         while ((cadena = bR.readLine()) != null) {
             System.out.println(cadena);
             cont++;
          }
         bR.close();
         System.out.println("\nTotal de lineas: "+cont);
     }
}
