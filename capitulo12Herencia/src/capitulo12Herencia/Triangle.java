package capitulo12Herencia;

public class Triangle extends TwoDShape{
    String style;
    double area() {
        return width * height / 2;
        //getWidth * getHeight /2        de twodshape
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
