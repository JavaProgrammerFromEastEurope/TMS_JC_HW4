package ClassWork.Polimorth.DrawFigures;

import static java.lang.System.*;

public class Square  implements  Drawable{

    private  int a = 5;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        for(int i =0; i<a;i++){
            for(int j =0; j<a;j++){
                out.print("* ");
            }
            out.println();
        }
    }
}
