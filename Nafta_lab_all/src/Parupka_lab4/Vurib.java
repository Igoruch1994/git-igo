package Parupka_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Vurib extends Spilka {
    String cost;
    public Vurib(String a) {
        cost=a;
    }

    public Vurib() {
        cost="Немає ціни";
    }

    @Override
    public String Name() {
        return "Виріб";
    }

    @Override
    public String ToyCost() {
        return cost;
    }
}
