package Human;

import Human.jacket.*;
import Human.pants.*;
import Human.shoes.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;


public class Run {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("Jack", new BlueJacket(), new BrownPants(), new GreenShoes()));
        humans.add(new Human("Daniel", new BrownJacket(), new GreenPants(), new BlueShoes()));
        humans.add(new Human("Margaretha", new GreenJacket(), new BluePants(), new BrownShoes()));


        for (Human human : humans) {

            out.println();
            human.putOn();
            out.println();
            human.putOff();
        }
    }
}
