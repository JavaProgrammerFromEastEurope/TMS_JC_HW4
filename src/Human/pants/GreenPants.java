package Human.pants;

import static java.lang.System.out;

public class GreenPants implements IPants {

    public GreenPants() {
    }

    @Override
    public void putOn() {
        out.println(" put on green pants ");
    }

    @Override
    public void putOff() {
        out.println(" put off green pants");
    }
}
