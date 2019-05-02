package Human.pants;

import static java.lang.System.out;

public class BluePants implements IPants {

    public BluePants() {
    }

    @Override
    public void putOn() {
        out.println(" put on blue pants ");
    }

    @Override
    public void putOff() {
        out.println(" put off blue pants ");
    }
}
