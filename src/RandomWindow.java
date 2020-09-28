import java.util.Random;
import javax.swing.*;
import java.awt.*;



public class RandomWindow extends JFrame {
    private int f = 0;
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    RandomWindow(){
        super("Figura");

        setSize(800,800);
        setBackground(Color.GREEN);
        setVisible(true);

    }
    private void drawShape(Shape shape, Graphics2D graphics2D) {
        shape.draw(graphics2D);
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

            f=((int)(Math.random()*3));
            Random rand= new Random();
            graphics2D.setColor( new Color(Math.abs(rand.nextInt())));
            switch (f) {
                case 0:
                    drawShape(new Circle(getRandomNumber(50,120)), graphics2D);
                    break;
                case 1:
                    drawShape(new Rectangle(getRandomNumber(70,120),getRandomNumber(60,120)), graphics2D);
                    break;
                case 2:
                    drawShape(new Square(getRandomNumber(70,120)), graphics2D);
                    break;

            }


    }


}