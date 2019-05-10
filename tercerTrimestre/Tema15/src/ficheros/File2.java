package ficheros;

import java.io.File;

public class File2 {
    
    public static void main(String[] args) {

        System.out.println("Ficheros en el directorio actual: ");
        File f=new File("./src/ficheros/");
        
        //Probad con "..", ¿qué archivos muestra?"
        
        String []archivos=f.list();
        
        for (int i=0; i< archivos.length; i++)
        {
            System.out.println(archivos[i]);
        }
   }
}

