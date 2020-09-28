import java.awt.*;

public class Square extends Rectangle {


    public double getSide() {
        return lenght;
    }

    public void setSide(int side) {
        this.lenght = side;
    }

    public Square() {}

    public Square(double lenght) {
        super(lenght, lenght);
    }

    public Square(String color, boolean filled, double lenght) {
        super(color, filled, lenght, lenght);
    }

    @Override
    public void draw(Graphics2D p) {
        super.draw(p);
        p.drawRect(centerX,centerY,(int)lenght,(int)lenght);
    }


}