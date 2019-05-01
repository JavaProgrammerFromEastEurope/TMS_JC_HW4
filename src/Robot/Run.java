package Robot;

import Robot.heads.*;
import Robot.hands.*;
import Robot.legs.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        List<Robot> robots = new ArrayList<>();
        robots.add(new Robot(new SamsungHead(25000), new SonyHand(9500), new ToshibaLeg(12500)));
        robots.add(new Robot(new SonyHead(23000), new ToshibaHand(8750), new SamsungLeg(15000)));
        robots.add(new Robot(new ToshibaHead(21000), new SamsungHand(10000), new SonyLeg(13000)));

        int max = robots.get(0).getPrice();

        for (Robot robot : robots) {
            if (max < robot.getPrice()) {
                max = robot.getPrice();
            }
            out.println();
            robot.action();
        }
        out.println(String.format("%n The robot with max price = %d:%n", max));
        for (Robot robot : robots) {
            if (robot.getPrice() == max) {
                robot.action();
                break;
            }
        }
    }
}
