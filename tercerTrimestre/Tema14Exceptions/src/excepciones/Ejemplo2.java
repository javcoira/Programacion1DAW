package excepciones;

class Ejemplo2 {
    public static void main(String args[]) {
         try {
             Prueba.generaException();
         }
         catch (ArrayIndexOutOfBoundsException exc) {
                 // catch the exception
                 System.out.println("Se propaga");
         }
         System.out.println("Mensaje posterior a catch");
     }
}