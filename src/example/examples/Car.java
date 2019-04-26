package example.examples;

import static java.lang.System.out;

public class Car {

    private String marc;
    private int speed;
    private int price;
    private boolean stateEngine = false;

    Car() {
        this.marc = "Lada";
        this.speed = 90;
        this.price = 1500;
        this.stateEngine = false;
    }

    Car(String marc, int speed, int price) {
        this.marc = marc;
        this.speed = speed;
        this.price = price;
    }

    void start() {
        if (!stateEngine) {
            stateEngine = true;
            out.println(String.format("%s engine has been started!", marc));
        } else {
            out.println(String.format("%s engine has been already started!", marc));
        }
    }

    void stop() {
        if (stateEngine) {
            stateEngine = false;
            out.println(String.format("%s engine has been shut down!", marc));
        } else {
            out.println(String.format("%s engine has been already shut down!", marc));
        }
    }

    public String getMarc() {
        return marc;
    }

    int getSpeed() {
        return speed;
    }

    int getPrice() {
        return price;
    }

    void setMarc(String marc) {
        this.marc = marc;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setPrice(int price) {
        this.price = price;
    }

    private static void test() {
        out.println("Test of the method");
    }

    int test(int first, int second) {
        return (first + second) / 2;
    }

    public void description() {
        out.println(String.format("Marc = %s, Speed = %d, Price = %d", marc, speed, price));
    }
}
