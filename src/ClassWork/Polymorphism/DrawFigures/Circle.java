package ClassWork.Polymorphism.DrawFigures;

import static java.lang.System.out;

public class Circle implements Drawable {

    @Override
    public void draw() {
        out.println("     ***     ");
        out.println("   *******    ");
        out.println("  *********     ");
        out.println("  *********     ");
        out.println("   *******    ");
        out.println("     ***     ");
    }
}
