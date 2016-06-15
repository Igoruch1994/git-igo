package Parupka_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Detal extends Spilka {
    String cost;
    public Detal(String a) {
        cost=a;
    }

    public Detal() {
        cost="Немає ціни";
    }

    @Override
    public String Name() {
        return "Деталька";
    }

    @Override
    public String ToyCost() {
        return cost;
    }
}
