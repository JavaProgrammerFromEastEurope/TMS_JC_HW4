package Car;

import java.util.Random;

import static java.lang.System.out;

public class Car {

    private String mark;
    private int speed;
    private int price;
    private boolean stateEngine = false;

    Car() {
        this.mark = "Lada";
        this.speed = 90;
        this.price = 1500;
        this.stateEngine = false;
    }

    Car(String marc, int speed, int price) {
        this.mark = marc;
        this.speed = speed;
        this.price = price;
    }

    void start() throws StartException {
        Random random = new Random();
        int temp = 1 + random.nextInt(20);
        out.println(String.format("The random variable = %d",temp));
        if (!stateEngine) {
            if (temp % 2 == 0) {
                out.println(String.format("%s engine break down!", mark));
                throw new StartException();
            } else {
                stateEngine = true;
                out.println(String.format("%s engine has been started!", mark));
            }
        } else {
            out.println(String.format("%s engine has been already started!", mark));
        }
    }

    void stop() {
        if (stateEngine) {
            stateEngine = false;
            out.println(String.format("%s engine has been shut down!", mark));
        } else {
            out.println(String.format("%s engine has been already shut down!", mark));
        }
    }

    public String getMark() {
        return mark;
    }

    int getSpeed() {
        return speed;
    }

    int getPrice() {
        return price;
    }

    void setMark(String mark) {
        this.mark = mark;
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
        out.println(String.format("Marc = %s, Speed = %d, Price = %d", mark, speed, price));
    }
}
