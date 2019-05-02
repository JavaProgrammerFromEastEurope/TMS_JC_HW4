package Calculator;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Calculator {

    final private static String messageTemplate = "- it's wrong value, please get input correctly!";
    final private static String messageTemplateFirst = "Input first number:";
    final private static String messageTemplateSecond = "Input second number:";
    private static Scanner scanner = new Scanner(in);

    void start() {
        out.println("Welcome!");
        run();
        out.println("See you soon!");
    }

    private void run() {
        while (true) {
            showMenu();
            int number = scanner.nextInt();
            if (number == 0) {
                scanner.close();
                break;
            }
            FunctionF functionX = getUserChoice(number);
            if (functionX == null) {
                out.println("Please get current input!");
                continue;
            }
            out.println(functionX.toString());
        }
    }

    private FunctionF getUserChoice(int number) {
        double firstInput;
        double secondInput;
        switch (number) {
            case 1:
                out.println(messageTemplateFirst);
                firstInput = initialize();
                out.println(messageTemplateSecond);
                secondInput = initialize();
                return new Addition(firstInput, secondInput);
            case 2:
                out.println(messageTemplateFirst);
                firstInput = initialize();
                out.println(messageTemplateSecond);
                secondInput = initialize();
                return new Subtraction(firstInput, secondInput);
            case 3:
                out.println(messageTemplateFirst);
                firstInput = initialize();
                out.println(messageTemplateSecond);
                secondInput = initialize();
                return new Multiplication(firstInput, secondInput);
            case 4:
                out.println(messageTemplateFirst);
                firstInput = initialize();
                out.println(messageTemplateSecond);
                secondInput = initialize();
                return new Division(firstInput, secondInput);
            case 5:
                out.println(messageTemplateFirst);
                firstInput = initialize();
                out.println(messageTemplateSecond);
                secondInput = initialize();
                return new Power(firstInput, secondInput);
            default:
                return null;
        }
    }

    private static double initialize() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                out.println(String.format("%s %s", scanner.next(), messageTemplate));
            }
        }
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