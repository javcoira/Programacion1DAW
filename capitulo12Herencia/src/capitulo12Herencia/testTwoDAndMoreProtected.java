package capitulo12Herencia;

public class testTwoDAndMoreProtected {

	public static void main(String[] args) {
		TriangleProtected t1 = new TriangleProtected();

		//en este caso se puede usar de las 2 formas, al ser protected y crear objeto de tipo hijo podemos aceder a 
		// width y height directamente o usando el setWidth
		
        //t1.setWidth(4.0);
        t1.width = 4.0;
        t1.height = 4.0;
        t1.setStyle("filled");
       
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
   
   	}

}
