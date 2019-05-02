package Human.shoes;

import static java.lang.System.out;

public class GreenShoes implements IShoes{

    public GreenShoes() {
    }

    @Override
    public void putOn() {
        out.println(" put on green shoes ");
    }

    @Override
    public void putOff() {
        out.println(" put on green shoes ");
    }
}
