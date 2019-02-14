package capitulo12Herencia;

/*no pueden ser private los atributos ya que no se podran usar fuera, si no es con los setter y getter*/
public class TwoDShape {
	//private double width
     double width;
     double height;

     // private void getHeight()
     
  public void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

}
