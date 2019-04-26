package ClassWork.Polymorphism.DrawFigures;

public class Main {
    public static void main(String[] args) {

        MyInterface a = new MyInterface() {
            @Override
            public void a() {
            }
        };


        Application application = new Application();
        application.start();
    }
}
