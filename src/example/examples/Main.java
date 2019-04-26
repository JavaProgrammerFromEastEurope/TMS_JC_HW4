package example.examples;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.setMarc("Audi");
        firstCar.setSpeed(250);
        firstCar.setPrice(150000);

        Car secondCar = new Car();
        secondCar.setMarc("BMW");
        secondCar.setSpeed(255);
        secondCar.setPrice(75000);

        out.println(String.format("Speed of the Audi = %d, speed of the BMW = %d", firstCar.getSpeed(), secondCar.getSpeed()));
        out.println(String.format("Price of the Audi = %d, price of the BMW = %d", firstCar.getPrice(), secondCar.getPrice()));
        out.println(String.format("The mark of first car  = %s, the mark of second car = %s", firstCar.getMarc(), secondCar.getMarc()));
        firstCar.start();
        secondCar.start();

        int temp = firstCar.test(2, 2);
        out.println(String.format("%d", temp));
        firstCar.description();
        secondCar.description();

        Car thirdCar = new Car();
        thirdCar.description();
        thirdCar.start();
        thirdCar.start();
        thirdCar.stop();
        thirdCar.stop();
    }
}
