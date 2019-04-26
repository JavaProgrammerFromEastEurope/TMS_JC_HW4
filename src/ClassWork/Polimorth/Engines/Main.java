package ClassWork.Polimorth.Engines;

public class Main {
    public static void main(String[] args) {

        Engine firstEngine = new GasEngine(300);
        Engine secondEngine = new ElectroEngine(350);

        Car firstCar = new Car("Audi", 25000,firstEngine);
        Car secondCar = new Car("Audi", 25000,secondEngine);

        firstCar.start();
        System.out.println();
        secondCar.start();
    }
}
