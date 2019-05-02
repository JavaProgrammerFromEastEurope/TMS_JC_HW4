package Spaceport;

import java.util.GregorianCalendar;
import java.util.Random;

import static java.lang.System.out;

public class Shuttle extends Rocket implements IStart{

    public Shuttle(GregorianCalendar dateOfLaunch, String codeOfLaunch, String engine, String name,
                   int numberOfSpaceman, int numberOfEngines) {
        super(dateOfLaunch, codeOfLaunch, engine, name, numberOfSpaceman, numberOfEngines);
    }

    public Shuttle() {}
    @Override
    public boolean systemCheck() {
        Random random = new Random();
        int temp = random.nextInt(10);
        if(temp > 3){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        out.println(" All systems on. Shuttle engines is started.");
    }

    @Override
    public void go() {
        out.println(String.format("%n The Shuttle was launched %s!",getDateOfLaunch()));
    }
}