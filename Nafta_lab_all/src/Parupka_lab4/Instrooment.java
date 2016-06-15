package Parupka_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Instrooment extends Spilka {
    String cost;
    public Instrooment(String a) {
        cost=a;
    }

    public Instrooment() {
        cost="Немає ціни";
    }

    @Override
    public String Name() {
        return "Інструмент";
    }

    @Override
    public String ToyCost() {
        return cost;
    }
}
