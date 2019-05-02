package Human.shoes;

import static java.lang.System.out;

public class BrownShoes implements IShoes{

    public BrownShoes() {
    }

    @Override
    public void putOn() {
        out.println(" put on brown shoes ");
    }

    @Override
    public void putOff() {
        out.println(" put off brown shoes ");
    }
}
