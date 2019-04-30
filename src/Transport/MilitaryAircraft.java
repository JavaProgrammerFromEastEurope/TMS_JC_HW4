package Transport;

public class MilitaryAircraft extends Air {

    private boolean catapult;
    private int numberOfMissiles;

    public MilitaryAircraft(int horsePower, int maxSpeed, int weight, String mark, int wingSpan,
                            int minLengthOfTheRunway, boolean catapult, int numberOfMissiles) {
        super(horsePower, maxSpeed, weight, mark, wingSpan, minLengthOfTheRunway);
        this.catapult = catapult;
        this.numberOfMissiles = numberOfMissiles;
    }

    public MilitaryAircraft() {

    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }



    public String toShoot() {
        if (getNumberOfMissiles() > 0) {
            numberOfMissiles--;
            return "Rocket fired now!";
        } else {
            return "No ammunition!";
        }
    }

    public String bailOut() {
        if (isCatapult()) {
            return "Bailout successful!";
        } else {
            return "You do not have such a system!";
        }
    }

    @Override
    public String toString() {
        return String.format("The Military Aircraft - %s, has horse power %s, max speed %s, weight %s,%n" +
                        " catapult %s, number of missiles %s, kilowatts %s.",
                getMark(), getHorsePower(), getMaxSpeed(), getWeight(), isCatapult(), getNumberOfMissiles(), getKilowatts());
    }
}
