package ejercicio2;

public interface Lista {

    void putInicio(Object obj);//Añade un objeto al principio de la lista
    void putFinal(Object obj);//Añade un objeto al final de la lista
    Object popPrincipio();//Obtiene y elimina el primer objeto de la lista
    Object popFinal();//Obtiene y elimina el último objeto de la lista
    Object getAt(int i);//Obtiene y elimina el elemento i de la lista
    int count();//Devuelve el número de objetos de la lista

}
