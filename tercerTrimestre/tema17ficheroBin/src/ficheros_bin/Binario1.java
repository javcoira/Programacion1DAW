package ficheros_bin;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binario1 {
   
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;

        try {
            fos = new FileOutputStream("c:\\adb\\datos.dat",true);
            salida = new DataOutputStream(fos); //para obtener m�todos de escritura

            System.out.print("Introduce n�mero entero. -1 para acabar: ");
            n = sc.nextInt();
            while (n != -1) {
                salida.writeInt(n); //se escribe el n�mero entero en el fichero
                System.out.print("Introduce n�mero entero. -1 para acabar: ");
                n = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
