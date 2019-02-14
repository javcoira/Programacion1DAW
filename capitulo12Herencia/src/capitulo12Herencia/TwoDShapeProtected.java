package capitulo12Herencia;

/*protected lo pueden usar solo padres eh hijos directos, no es necesario getter y setter, si son mas lejanos si se necesita getter y setter*/
public class TwoDShapeProtected {
     protected double width;
     protected double height;
     
  public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

public void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

}
