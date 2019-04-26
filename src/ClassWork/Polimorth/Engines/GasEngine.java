package ClassWork.Polimorth.Engines;

import static java.lang.System.*;

public class GasEngine extends Engine{

    public GasEngine(int power) {
        super(power);
    }

    public GasEngine() {}


    @Override
    public void startEngine() {
        out.println(String.format("Включение насосов %n " +
                "Запуск бензинового двигателя мощностью %s", getPower()));
    }
}
