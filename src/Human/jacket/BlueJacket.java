package Human.jacket;

import static java.lang.System.out;

public class BlueJacket implements IJacket{

    public BlueJacket() {
    }

    @Override
    public void putOn() {
        out.println(" put on blue jacket ");
    }

    @Override
    public void putOff() {
        out.println(" put off blue jacket");
    }
}
