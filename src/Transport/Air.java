package Transport;

public class Air extends Transport {

    private int wingSpan;
    private int theMinimumLengthOfTheRunway;

    public Air(int horsePower, int maxSpeed, int weight, String mark, int wingSpan, int theMinimumLengthOfTheRunway) {
        super(horsePower, maxSpeed, weight, mark);
        this.wingSpan = wingSpan;
        this.theMinimumLengthOfTheRunway = theMinimumLengthOfTheRunway;
    }

    public Air() {
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void setTheMinimumLengthOfTheRunway(int theMinimumLengthOfTheRunway) {
        this.theMinimumLengthOfTheRunway = theMinimumLengthOfTheRunway;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getTheMinimumLengthOfTheRunway() {
        return theMinimumLengthOfTheRunway;
    }
}
