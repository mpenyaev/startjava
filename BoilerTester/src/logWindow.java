import java.awt.*; /*Подключаем библиотеку для создания апплетов и независимых
                                приложений с графическим интерфейсом.*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class logWindow extends Frame {   /*Создаем подкласс logWindow  класса Frame*/
    public logWindow ()   /*Конструктор класса*/
    {
        super ("Logger");   /*Вызываем конструктор суперкласса и передаем ему параметр, в данном случае имя программы*/
        setSize (1000,500);  /*Метод суперкласса для установкиразмеров окна, в пикселях*/
        //Создаем объекты
        Button myButton = new Button ("Monitor");  /*Создаем кнопку и надпись на  ней*/
        Label myLabel = new Label ("Logger DATA"); /* Создаем текстовое поле и надпись в нем*/
        add (myLabel, BorderLayout.NORTH); /* С помощью менеджера размещения, располагаем текстовое поле в северной части окна*/
        add (myButton, BorderLayout.SOUTH); /*Кнопку в южной части*/
        myButton.addActionListener (new ActionListener () {    /*Для кнопки выбираем событие слушателя, и создаем новое событие в скобках.*/
            public void actionPerformed (ActionEvent e) {
                myLabel.setText ("Monitor"); /*Выполняется действие, т.е. при нажатии на кнопку в поле выводится сообщение  «Мониторинг» */
            }
        });
    }
    public static void main (String[] args) {      //Точка входа программы
        logWindow log = new logWindow ();      //Создаем объект класса
        log.setVisible (true);                                //Устанавливаем видимость окна
        /*Наше окно запускается и отображается, при нажатии на кнопку меняется надпись в текстовом поле. Что бы закрыть окно необходимо добавить код обработки события, который работает следующим образом: мы вызываем для объекта log метод addWindowListener для того, чтобы назначить слушателя оконных событий. В качестве параметра создаем объект абстрактного класса WindowAdapter, в котором создаем класс и переопределяем метод для обработки события закрытия окна -  dispose.*/
        log.addWindowListener (new WindowAdapter () {
            public void windowClosing (WindowEvent e) {    // в качестве аргумента передаем событие
                e.getWindow ().dispose ();                               // уничтожает объект Frame
            }
        });
    }
}