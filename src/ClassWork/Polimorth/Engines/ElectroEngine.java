package ClassWork.Polimorth.Engines;

import static java.lang.System.out;

public class ElectroEngine extends Engine{

    public ElectroEngine(int power) {
        super(power);
    }

    public ElectroEngine() {
    }

    @Override
    public void startEngine() {
        out.println(String.format("Запуск электродвигателя мощностью %s", getPower()));
    }
}
