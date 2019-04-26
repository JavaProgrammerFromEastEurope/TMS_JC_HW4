package ClassWork.Animal;

import static java.lang.System.out;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public void sound() {
        out.println(String.format("The dog with name %s doing sound RRRRR!", super.getName()));
    }
}
