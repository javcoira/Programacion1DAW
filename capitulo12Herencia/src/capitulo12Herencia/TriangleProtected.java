package capitulo12Herencia;

public class TriangleProtected extends TwoDShapeProtected{
   private String style;
    public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
	double area() {
        return width * height / 2;
        //al tner su padre protected los atributos se pueden usar asi sin get
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
