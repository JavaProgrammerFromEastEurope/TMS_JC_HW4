package Car;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.setMark("Audi");
        firstCar.setSpeed(250);
        firstCar.setPrice(150000);

        Car secondCar = new Car();
        secondCar.setMark("BMW");
        secondCar.setSpeed(255);
        secondCar.setPrice(75000);

        out.println(String.format("Speed of the Audi = %d, speed of the BMW = %d", firstCar.getSpeed(), secondCar.getSpeed()));
        out.println(String.format("Price of the Audi = %d, price of the BMW = %d", firstCar.getPrice(), secondCar.getPrice()));
        out.println(String.format("The mark of first car  = %s, the mark of second car = %s", firstCar.getMark(), secondCar.getMark()));

        try {
            firstCar.start();
        } catch (StartException e) {
            out.println(e.getMessage());
        }
        try {
            secondCar.start();
        } catch (StartException e) {
            out.println(e.getMessage());
        }


        Car thirdCar = new Car();
        thirdCar.description();
        try {
            thirdCar.start();
        } catch (StartException e) {
            out.println(e.getMessage());
        }
        try {
            thirdCar.start();
        } catch (StartException e) {
            out.println(e.getMessage());
        }
        thirdCar.stop();
        thirdCar.stop();
    }
}
