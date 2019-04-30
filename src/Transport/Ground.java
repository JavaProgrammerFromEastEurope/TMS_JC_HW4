package Transport;

public class Ground extends Transport {

    private int wheelsNumber;
    private double fuelConsumption;

    public Ground(int horsePower, int maxSpeed, int weight, String mark, int wheelsNumber, double fuelConsumption) {
        super(horsePower, maxSpeed, weight, mark);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public Ground() {
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
