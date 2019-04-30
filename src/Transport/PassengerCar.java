package Transport;

public class PassengerCar extends Ground {

    private String bodyStyle;
    private int passengerNumber;

    public PassengerCar(int horsePower, int maxSpeed, int weight, String mark,
                        int wheelsNumber, double fuelConsumption, String bodyType, int passengerNumber) {
        super(horsePower, maxSpeed, weight, mark, wheelsNumber, fuelConsumption);
        this.bodyStyle = bodyType;
        this.passengerNumber = passengerNumber;
    }

    public PassengerCar() {
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }


    public String getTravelInfo(double time) {
        double km = getMaxSpeed() * time;
        double fc = getTotalFuelExpenses(km);
        return String.format("In %.1f hours, %s's car, moving at a maximum speed of %d km/h, " +
                "will travel %.0f km and use up %.1f liters of fuel", time, getMark(), getMaxSpeed(), km, fc);
    }

    private double getTotalFuelExpenses(double km) {
        return getFuelConsumption() / 100 * km;
    }

    @Override
    public String toString() {
        return String.format("The Passenger Car - %s, has horse power - %s, max speed - %s, weight - %s,%n" +
                        " wheels number - %s, fuel consumption - %.1f, body style - %s, passenger number - %s, kilowatts - %s.",
                getMark(), getHorsePower(), getMaxSpeed(), getWeight(),
                getWheelsNumber(), getFuelConsumption(), getBodyStyle(), getPassengerNumber(), getKilowatts());
    }
}