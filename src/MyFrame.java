import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


class MyFrame extends JFrame {

    MyFrame (int a, int b){
        setTitle("Фигура");
        MyPanel panel = new MyPanel();
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(a,b); //положение окна
        add (panel); //добавление панели
        setVisible(true); //Отображение окна
    }
}

class MyPanel extends JPanel{ //класс панели
    MyPanel(){
        JButton button = new JButton ("Создать фигуру");
        add(button); //добавление кнопки на панель
        button.addActionListener(listener); //регистрация обработчика
    }
    ActionListener listener = new ActionListener (){ //обработчик кнопки - объект анонимного класса


        @Override
        public void actionPerformed(ActionEvent e) {
            new RandomWindow();
        }
    };
}

