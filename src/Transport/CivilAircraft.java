package Transport;

public class CivilAircraft extends Air {

    private int numberOfPassengers;
    private boolean businessClass;

    public CivilAircraft(int horsePower, int maxSpeed, int weight, String mark, int wingSpan,
                         int theMinimumLengthOfTheRunway, int numberOfPassengers, boolean businessClass) {
        super(horsePower, maxSpeed, weight, mark, wingSpan, theMinimumLengthOfTheRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public CivilAircraft() {

    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }


    public String loadCapacity(int loadCapacity) {
        if (getNumberOfPassengers() >= loadCapacity) {
            return String.format("%s loaded!", getMark());
        } else {
            return "You need a bigger aircraft";
        }
    }

    @Override
    public String toString() {
        return String.format("The Civil Aircraft - %s, has horse power - %s, max speed - %s, weight - %s,%n" +
                        " number of passengers - %s, business class - %s, kilowatts - %s.",
                getMark(), getHorsePower(), getMaxSpeed(), getWeight(),
                getNumberOfPassengers(), isBusinessClass(), getKilowatts());
    }
}