package ClassWork.Polimorth.DrawFigures;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Application {

    private Scanner scanner = new Scanner(in);

    void start() {
        out.println("добро пожаловать!");
        run();
        out.println("Всего доброго!");
    }

    private void run() {
        while (true) {
            showMenu();
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            Drawable drawable = getUserChoice(number);
            if (drawable == null) {
                out.println("нет такой фигуры!");
                continue;
            }
            drawable.draw();
        }
    }

    private Drawable getUserChoice(int number) {
        switch (number) {
            case 1:
                out.println("Введите сторону");
                int a = scanner.nextInt();
                return new Square(a);
            case 2:
                return new Triangle();
            case 3:
                return new Circle();
            default:
                return null;

        }
    }

    private void showMenu() {
        out.println("What do you want to pain?");
        out.println("1- square");
        out.println("2 - triangle");
        out.println("3- круг");
        out.println("0- exit");
    }
}
