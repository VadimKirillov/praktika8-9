import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println();

        Window stage = new Window();
        TimeUnit.SECONDS.sleep(4);
        stage.dispose();
        SecondWindow stage2 = new SecondWindow();
        TimeUnit.SECONDS.sleep(7);
        stage2.dispose();








    }
}