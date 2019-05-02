package Human.pants;

import static java.lang.System.out;

public class BrownPants implements IPants {

    public BrownPants() {
    }

    @Override
    public void putOn() {
        out.println(" put on brown pants ");
    }

    @Override
    public void putOff() {
        out.println(" put off brown pants ");
    }
}
