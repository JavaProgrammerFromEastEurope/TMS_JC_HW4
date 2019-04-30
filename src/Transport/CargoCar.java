package Transport;

public class CargoCar extends Ground {

    private int loadCapacity;

    public CargoCar(int horsePower, int maxSpeed, int weight, String mark, int wheelsNumber,
                    int fuelConsumption, int loadCapacity) {
        super(horsePower, maxSpeed, weight, mark, wheelsNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public CargoCar() {

    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }


    public String loadCapacity(int loadCapacity) {
        if(getLoadCapacity() >= loadCapacity){
            return String.format("%s loaded!", getMark());
        } else {
            return "You need a bigger truck";
        }
    }

    @Override
    public String toString() {
        return String.format("The Cargo Car - %s, has horse power - %s, max speed - %s, weight - %s,%n" +
                        " wheels number - %s, fuel consumption - %.1f, load capacity - %s, kilowatts - %s.",
                getMark(), getHorsePower(), getMaxSpeed(), getWeight(),
                getWheelsNumber(), getFuelConsumption(), getLoadCapacity(), getKilowatts());
    }
}
