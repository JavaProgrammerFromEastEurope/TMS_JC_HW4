package ClassWork.Polimorth.newPackage;

import static java.lang.System.out;

public interface MyInterface {

    void a();
    default void b(){
        out.println("11111111");
    };
}
