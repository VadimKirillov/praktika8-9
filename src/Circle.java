import java.awt.*;
import java.util.Random;

public class Circle extends Shape {
    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void moveRight(int speed){
        centerX+=speed;
    }
    public void moveLeft(int speed){
        centerX-=speed;
    }
    public void moveUp(int speed){
        centerY+=speed;
    }
    public void moveDown(int speed){
        centerY-=speed;
    }


    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }


    @Override
    public double getPerimeter() {
        return 2*(Math.PI*radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }

    @Override
    public void draw(Graphics2D p) {
        super.draw(p);
        p.drawRoundRect(centerX,centerY,(int)radius*2,(int)radius*2,10000,10000);

    }
    public void drawCircle(Graphics2D p,int centerX, int centerY){
        this.centerX= centerX;
        this.centerY= centerY;
        p.drawRoundRect(this.centerX,this.centerY,(int)radius*2,(int)radius*2,10000,10000);
    }


}