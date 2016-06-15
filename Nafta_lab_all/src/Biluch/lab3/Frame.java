package Biluch.lab3;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class Frame {
    private int level;
    private  int number_unit;
    char[] name= {};

    public Frame(int level, int number_unit, char[] name) {
        this.level = level;
        this.number_unit = number_unit;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumber_unit() {
        return number_unit;
    }

    public void setNumber_unit(int number_unit) {
        this.number_unit = number_unit;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }
}
