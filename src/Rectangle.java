import java.awt.*;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;



    public Rectangle() {}

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.lenght = lenght;
        this.width = width;

    }

    @Override
    public double getArea() {
        return lenght*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(lenght+width);
    }

    @Override
    public void draw(Graphics2D d) {
        super.draw(d);
        d.drawRect(centerX,centerY,(int)width,(int)lenght);

    }

}