import java.util.Random;
import javax.swing.*;
import java.awt.*;



public class Window extends JFrame {
    private int f = 0;
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    Window(){
        super("20 Figur");

        //setLayout(new FlowLayout());
        setSize(1000,1000);
        setBackground(Color.GREEN);

        setForeground(Color.RED);
        setVisible(true);


    }
    private void drawShape(Shape shape, Graphics2D graphics2D) {
        shape.draw(graphics2D);
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;


        for (int i=0 ; i<20; i++){
            f=((int)(Math.random()*3));
            Random rand= new Random();
            graphics2D.setColor( new Color(Math.abs(rand.nextInt())));
            switch (f) {
                case 0:
                    drawShape(new Circle(getRandomNumber(50,150)), graphics2D);
                    break;
                case 1:
                    drawShape(new Rectangle(getRandomNumber(70,170),getRandomNumber(60,170)), graphics2D);
                    break;
                case 2:
                    drawShape(new Square(getRandomNumber(70,170)), graphics2D);
                    break;

            }

        }
    }


}