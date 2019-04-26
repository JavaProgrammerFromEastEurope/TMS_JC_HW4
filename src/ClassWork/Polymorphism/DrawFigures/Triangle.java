package ClassWork.Polymorphism.DrawFigures;

public class Triangle implements  Drawable {
    @Override
    public void draw() {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}
