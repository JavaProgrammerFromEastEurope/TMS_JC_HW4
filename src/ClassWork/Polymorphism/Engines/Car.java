package ClassWork.Polymorphism.Engines;

public class Car {
    private String marc;
    private int price;
    private Engine engine;

    public Car(String marc, int price, Engine engine) {
        this.marc = marc;
        this.price = price;
        this.engine = engine;
    }

    private Car() {

    }

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Запуск двигателя");
        engine.startEngine();
        System.out.printf("%s завелся %n", marc);
    }
}
