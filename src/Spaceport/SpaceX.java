package Spaceport;

import java.util.GregorianCalendar;
import java.util.Random;

import static java.lang.System.out;

public class SpaceX extends Rocket implements IStart{

    public SpaceX(GregorianCalendar dateOfLaunch, String codeOfLaunch, String engine,
                  String name, int numberOfSpaceman, int numberOfEngines) {
        super(dateOfLaunch, codeOfLaunch, engine, name, numberOfSpaceman, numberOfEngines);
    }

    public SpaceX() {}
    @Override
    public boolean systemCheck() {
        Random random = new Random();
        int temp = random.nextInt(10);
        if(temp > 5){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        out.println(" All systems on. Rocket engines is started.");
    }

    @Override
    public void go() {
        out.println(String.format("%n The Rocket was launched %s!",getDateOfLaunch()));
    }
}
