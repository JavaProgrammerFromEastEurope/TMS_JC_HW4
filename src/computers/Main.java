package computers;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        //First Part Exercise
        Computer computer = new Computer("Intel i5", 6, 2048, 3);

        computer.on();
        computer.off();
        computer.on();
        computer.off();
        computer.on();
        computer.off();
        computer.on();
        computer.off();

        //Second Part Exercise
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Intel i5", 6, 1024, 2000));
        computers.add(new Computer("Intel i7", 12, 2048, 2500));
        computers.add(new Computer("Intel i3", 8, 1024, 7500));
        computers.add(new Computer("Intel i9", 16, 4096, 10000));
        computers.add(new Computer("Intel i5", 4, 1024, 9000));

        out.println();
        Computer.maxRandomAccessMemory(computers);
        out.println();
        Computer.minHardDriveMemory(computers);
    }
}
