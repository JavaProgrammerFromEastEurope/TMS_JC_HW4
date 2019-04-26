package ClassWork.Polymorphism.Engines;

import static java.lang.System.out;

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
