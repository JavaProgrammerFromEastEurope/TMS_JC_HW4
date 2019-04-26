package ClassWork.Animal;

public class Main extends Animal {

    public static void main(String[] args) {
        Animal cat = new Cat("Snowball",5);
        Animal dog = new Dog("Balloon",4);

        cat.sound();
        dog.sound();
    }
}
