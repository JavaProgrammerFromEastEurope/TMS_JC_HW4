package Human.jacket;

import static java.lang.System.*;

public class BrownJacket implements IJacket{

    public BrownJacket() {
    }

    @Override
    public void putOn() {
        out.println(" put on brown jacket");
    }

    @Override
    public void putOff() {
        out.println(" put off brown jacket ");
    }
}
