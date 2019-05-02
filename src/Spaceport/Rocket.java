package Spaceport;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Random;

import static java.lang.System.out;

public abstract class Rocket {

    private GregorianCalendar dateOfLaunch;
    private String codeOfLaunch;
    private String engine;
    private String name;
    private int numberOfSpaceman;
    private int numberOfEngines;


    public Rocket(GregorianCalendar dateOfLaunch, String codeOfLaunch, String engine, String name, int numberOfSpaceman, int numberOfEngines) {
        this.dateOfLaunch = dateOfLaunch;
        this.codeOfLaunch = codeOfLaunch;
        this.engine = engine;
        this.name = name;
        this.numberOfSpaceman = numberOfSpaceman;
        this.numberOfEngines = numberOfEngines;
    }

    public Rocket() {}

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSpaceman(int numberOfSpaceman) {
        this.numberOfSpaceman = numberOfSpaceman;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public void setDateOfLaunch(GregorianCalendar dateOfLaunch) {
        this.dateOfLaunch = dateOfLaunch;
    }

    public void setCodeOfLaunch(String codeOfLaunch) {
        this.codeOfLaunch = codeOfLaunch;
    }

    public String getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSpaceman() {
        return numberOfSpaceman;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public String getDateOfLaunch() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy");
        return fmt.format(dateOfLaunch.getTime());
    }

    public String getCodeOfLaunch() {
        return codeOfLaunch;
    }

    @Override
    public String toString() {
        return String.format(" The spacecraft - %s %n had code - %s, " +
                        "engine - %s, number Of engines - %s, number of spaceman - %s",
                getName(), getCodeOfLaunch(),getEngine(),getNumberOfEngines(),getNumberOfSpaceman());
    }
}
