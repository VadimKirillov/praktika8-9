import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;


public class SecondWindow extends JFrame {
    private int f = 0;
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    SecondWindow(){
        super("Figura");

        //setLayout(new FlowLayout());
        setSize(1000,1000);
        setBackground(Color.GREEN);

        setForeground(Color.RED);
        setVisible(true);


    }
    private void drawShape(Shape shape, Graphics2D graphics2D) {
        shape.draw(graphics2D);
    }
    private void drawCircle(Circle circle, Graphics2D graphics2D) {
        circle.drawCircle(graphics2D, circle.centerX, circle.centerY);
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Circle a= new Circle(80) ;
        a.centerX = 300;
        a.centerY = 250;

        //drawShape( a , graphics2D);
        drawCircle(a , graphics2D);

        for (int i=0 ; i<20; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f=((int)(Math.random()*4));


            switch (f) {
                case 0:
                    a.moveUp(50);
                    drawCircle(a,graphics2D);
                    break;
                case 1:
                    a.moveDown(50);
                    drawCircle(a,graphics2D);
                    break;
                case 2:
                    a.moveRight(50);
                    drawCircle(a,graphics2D);
                    break;
                case 3:
                    a.moveLeft(50);
                    drawCircle(a,graphics2D);
                    break;

            }

        }
    }




}