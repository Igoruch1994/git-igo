package Tarasuch_lab3;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Nachalnika {
    char[] name;
    int shtat;
    char[] nachalnika;

    public Nachalnika(char[] name, int shtat, char[] nachalnika) {
        this.name = name;
        this.shtat = shtat;
        this.nachalnika = nachalnika;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int getShtat() {
        return shtat;
    }

    public void setShtat(int shtat) {
        this.shtat = shtat;
    }

    public char[] getNachalnika() {
        return nachalnika;
    }

    public void setNachalnika(char[] nachalnika) {
        this.nachalnika = nachalnika;
    }
}
