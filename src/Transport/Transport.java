package Transport;

public class Transport {

     private int horsePower;
     private int maxSpeed;
     private int weight;
     private String mark;

    public Transport(int horsePower, int maxSpeed, int weight, String mark) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    public Transport() {
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }
    public int getKilowatts() {
        return (int)(getHorsePower() * 0.74);
    }
}
