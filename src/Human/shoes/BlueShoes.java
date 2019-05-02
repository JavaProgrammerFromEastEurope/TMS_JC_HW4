package Human.shoes;

import static java.lang.System.out;

public class BlueShoes implements IShoes{

    public BlueShoes() {
    }

    @Override
    public void putOn() {
        out.println(" put on blue shoes ");
    }

    @Override
    public void putOff() {
        out.println(" put off blue shoes ");
    }
}
