package ClassWork.Polymorphism.DrawFigures;

import static java.lang.System.out;

public class Application {

    void start() {
        out.println("Welcome!");
        run();
        out.println("See you soon!");
    }

    private void run() {
        while (true) {
            try {
                Drawable drawable = getUserChoice();
                drawable.draw();
            } catch (StopApplicationException e) {
                break;
            }
        }
    }

    private Drawable getUserChoice() throws StopApplicationException {
        showMenu();
        int number = Input.getInt();
        switch (number) {
            case 1:
                out.println("Input square side");
                int a =  Input.getInt();
                return new Square(a);
            case 2:
                return new Triangle();
            case 3:
                return new Circle();
            case 0:
                throw new StopApplicationException();
            default:
                out.println("The figure with current input is not exist!");
                return getUserChoice();
        }
    }

    private void showMenu() {
        out.println("What do you want to pain?");
        out.println("1 - square");
        out.println("2 - triangle");
        out.println("3 - circle");
        out.println("0 - exit");
    }
}