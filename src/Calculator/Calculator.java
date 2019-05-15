package Calculator;

import static java.lang.System.out;

public class Calculator {

    final private static String messageTemplateFirst = "Input first number:";
    final private static String messageTemplateSecond = "Input second number:";
    private double firstInput;
    private double secondInput;

    void start() {
        out.println("Welcome!");
        run();
        out.println("See you soon!");
    }

    private void run() {
        while (true) {
            try {
                IFunctionF functionF = getUserChoice();
                out.println(functionF.toString());
            } catch (StopApplicationException e) {
                break;
            }
        }
    }

    private IFunctionF getUserChoice() throws StopApplicationException {
        showMenu();
        int number = Input.getInt();

        switch (number) {
            case 1:
                initialize();
                return new Addition(firstInput, secondInput);
            case 2:
                initialize();
                return new Subtraction(firstInput, secondInput);
            case 3:
                initialize();
                return new Multiplication(firstInput, secondInput);
            case 4:
                initialize();
                return new Division(firstInput, secondInput);
            case 5:
                initialize();
                return new Power(firstInput, secondInput);
            case 0:
                throw new StopApplicationException();
            default:
                out.println("The operation with current input is not exist!");
                return getUserChoice();
        }
    }

    private void initialize() {
        out.println(messageTemplateFirst);
        firstInput = Input.getDouble();
        out.println(messageTemplateSecond);
        secondInput = Input.getDouble();
    }

    private void showMenu() {
        out.println("What do you want to do?");
        out.println("1 - Addition");
        out.println("2 - Subtraction");
        out.println("3 - Multiplication");
        out.println("4 - Division");
        out.println("5 - Power");
        out.println("0 - Exit");
    }
}