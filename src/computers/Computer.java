package computers;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;
import static java.lang.System.out;

public class Computer {

    private String processor;
    private int randomAccessMemory;
    private int hardDriveMemory;
    private int fullCycleWork;
    private boolean state = false;
    private static int maxRandomAccessMemory = 0;
    private static int minHardDriveMemory = 10000;
    final private String messageTemplateBreak = "ERROR: Computer break down!";
    final private String messageTemplateBreakAlready = "ERROR: Computer break down already!";

    public Computer(String processor, int randomAccessMemory, int hardDriveMemory, int fullCycleWork) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDriveMemory = hardDriveMemory;
        this.fullCycleWork = fullCycleWork;
        maxRAM(randomAccessMemory);
        minHDD(hardDriveMemory);
    }

    private static void maxRAM(int randomAccessMemory) {
        if (maxRandomAccessMemory < randomAccessMemory) {
            maxRandomAccessMemory = randomAccessMemory;
        }
    }

    private static void minHDD(int hardDriveMemory) {
        if (minHardDriveMemory > hardDriveMemory) {
            minHardDriveMemory = hardDriveMemory;
        }
    }

    public Computer() {

    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public void setHardDriveMemory(int hardDriveMemory) {
        this.hardDriveMemory = hardDriveMemory;
    }

    public void setFullCycleWork(int fullCycleWork) {
        this.fullCycleWork = fullCycleWork;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public int getHardDriveMemory() {
        return hardDriveMemory;
    }

    public int getFullCycleWork() {
        return fullCycleWork;
    }

    public void on() {

        if (fullCycleWork > 0) {
            if (!state) {
                Random random = new Random();
                int temp = random.nextInt(2);
                out.println();
                out.println("TIP: The Random value = " + temp + " right now!");
                out.print("Input number: ");
                Scanner scanner = new Scanner(in);
                if (temp == scanner.nextInt()) {
                    state = true;
                    String messageTemplateTurnOn = "Computer switched on!";
                    out.println(messageTemplateTurnOn);
                } else {
                    fullCycleWork = 0;
                    out.println(messageTemplateBreak);
                }
            } else {
                out.println("Computer switched on already!");
            }
        } else {
            out.println(messageTemplateBreakAlready);
        }
    }

    public void off() {

        if (fullCycleWork > 0) {
            if (state) {
                Random random = new Random();
                int temp = random.nextInt(2);
                out.println();
                out.println("TIP: The Random value = " + temp + " right now!");
                out.print("Input number: ");
                Scanner scanner = new Scanner(in);
                if (temp == scanner.nextInt()) {
                    fullCycleWork--;
                    state = false;
                    String messageTemplateTurnOff = "Computer switched off!";
                    out.println(messageTemplateTurnOff);
                    if (fullCycleWork == 0) {
                        out.println(String.format("Full Cycles off work = 0 %n%s", messageTemplateBreak));
                    }
                } else {
                    fullCycleWork = 0;
                    out.println(messageTemplateBreak);
                }
            } else {
                out.println("Computer switched off already!");
            }
        } else {
            out.println(messageTemplateBreakAlready);
        }
    }

    public String toString() {
        return String.format("%s %d\t%d\t%d", processor, randomAccessMemory, hardDriveMemory, fullCycleWork);
    }


    static void maxRandomAccessMemory(List<Computer> computerList) {

        out.println(MessageFormat.format("---- List of computers that their Random Access Memory = {0} ----", maxRandomAccessMemory));

        Map<Boolean, List<Computer>> ComputerListByValue = computerList.stream()
                .collect(Collectors.partitioningBy(s -> s.getRandomAccessMemory() == maxRandomAccessMemory));

        ComputerListByValue.forEach((k, v) -> out.printf("Key: %s\n\t%s%n", k,
                v.stream().map(Computer::toString).collect(Collectors.joining(" \n\t"))));
    }

    static void minHardDriveMemory(List<Computer> computerList) {

        out.println(MessageFormat.format("---- List of computers that their Hard Drive Memory = {0} ----", minHardDriveMemory));

        Map<Boolean, List<Computer>> ComputerListByValue = computerList.stream()
                .collect(Collectors.partitioningBy(s -> s.getHardDriveMemory() == minHardDriveMemory));

        ComputerListByValue.forEach((k, v) -> out.printf("Key: %s\n\t%s%n", k,
                v.stream().map(Computer::toString).collect(Collectors.joining(" \n\t"))));
    }
}