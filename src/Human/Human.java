package Human;

import Human.jacket.IJacket;
import Human.pants.IPants;
import Human.shoes.IShoes;

import static java.lang.System.out;

public class Human implements IHuman{

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;


    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    public Human() {
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public String getName() {
        return name;
    }

    public void putOn() {
        out.println(String.format("%s ", getName()));
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void putOff() {
        out.println(String.format("%s ", getName()));
        jacket.putOff();
        pants.putOff();
        shoes.putOff();
    }

}