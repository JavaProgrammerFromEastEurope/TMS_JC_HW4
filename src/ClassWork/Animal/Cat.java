package ClassWork.Animal;

import static java.lang.System.out;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {

    }

    public void sound() {
        out.println(String.format("The cat with name %s doing sound MEAW!", super.getName()));
    }
}
