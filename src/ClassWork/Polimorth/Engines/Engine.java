package ClassWork.Polimorth.Engines;

public abstract class Engine {

    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public Engine() {
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public abstract void startEngine();
}
