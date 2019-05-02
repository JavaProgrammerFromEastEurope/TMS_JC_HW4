package Human.jacket;

import static java.lang.System.out;

public class GreenJacket implements IJacket{

    public GreenJacket() {
    }

    @Override
    public void putOn() {
        out.println(" put on green jacket");
    }

    @Override
    public void putOff() {
        out.println(" put off green jacket");
    }
}
