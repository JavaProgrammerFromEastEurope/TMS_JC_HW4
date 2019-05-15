package ClassWork.Polymorphism.DrawFigures;

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.in;

public class Input {

    private static Scanner scanner = new Scanner(in);

    public static int getInt(){
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        scanner.next();
        out.println("That is not a number");
        return getInt();
    }
}
