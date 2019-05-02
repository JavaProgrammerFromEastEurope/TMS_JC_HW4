package Spaceport;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.System.*;

public class Run {
    public static void main(String[] args) {


        SpaceX crewDragon = new SpaceX(new GregorianCalendar(2019, Calendar.AUGUST, 3),
                "DM-1", "Draco", "Crew Dragon", 7, 9);

        Shuttle discovery = new Shuttle(new GregorianCalendar(2011, Calendar.FEBRUARY, 24),
                "STS-135", "RS-25", "Discovery", 4, 6);

        ArrayList<IStart> rockets = new ArrayList<>();
        rockets.add(crewDragon);
        rockets.add(discovery);

        Spaceport spaceport = new Spaceport();
        for (IStart rocket: rockets) {
            out.println(rocket.toString());
            spaceport.launch(rocket);
            out.println();
        }
    }
}