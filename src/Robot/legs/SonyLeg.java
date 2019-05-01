package Robot.legs;


public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Sony legs have made a move!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
