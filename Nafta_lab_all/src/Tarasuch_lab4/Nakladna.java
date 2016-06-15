package Tarasuch_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Nakladna extends Spilne {
    String date;
    public Nakladna(){
        date="Не вказано";
    }
    public Nakladna(String a){
        date=a;
    }
    @Override
    public String getTypeName() {
        return "Накладна";
    }
    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String KtoPidpusav() {
        return "Andriy Bogdanivich";
    }
}
