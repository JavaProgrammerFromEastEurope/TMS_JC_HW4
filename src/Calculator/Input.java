package Calculator;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

 class Input {

    private static Scanner scanner = new Scanner(in);

    public static int getInt(){
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        scanner.next();
        out.println("That is not a number");
        return getInt();
    }
     public static double getDouble(){
         if (scanner.hasNextDouble()) {
             return scanner.nextDouble();
         } else {
             scanner.next();
             out.println("That is not a number");
             return getDouble();
         }
     }
}
