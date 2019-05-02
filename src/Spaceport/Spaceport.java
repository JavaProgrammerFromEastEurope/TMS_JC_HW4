package Spaceport;

import static java.lang.System.out;

public class Spaceport {

    void launch(IStart istart) {
        if (istart.systemCheck()) {
            istart.startEngine();
            for (int i=10; i>0;i--){
                out.print(" " + i);
            }
            istart.go();
        } else {
            out.println(" System check is false");
        }
    }
}
