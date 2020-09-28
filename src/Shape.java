import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected int centerX;
    protected int centerY;
    protected String color;
    protected boolean filled;



    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void isFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public  void draw(){
        Random rand=new Random();
        centerX=Math.abs(rand.nextInt())%500+100;
        centerY=Math.abs(rand.nextInt())%500+100;

    }
    public  void draw(Graphics2D p){
        Random rand=new Random();
        centerX=Math.abs(rand.nextInt())%500+100;
        centerY=Math.abs(rand.nextInt())%500+100;

    }


}