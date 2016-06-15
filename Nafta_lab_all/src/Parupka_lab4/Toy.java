package Parupka_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Toy extends Spilka {
    String cost;
    public Toy(String a) {
        cost=a;
    }

    public Toy() {
        cost="Немає ціни";
    }

    @Override
    public String Name() {
        return "Іграшка";
    }

    @Override
    public String ToyCost() {
        return cost;
    }
}
