package Tarasuch_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Kvitancia extends Spilne {

    String date;
    public Kvitancia(){
        date="Не вказано";
    }
    public Kvitancia(String a){
        date=a;
    }

    @Override
    public String getTypeName() {
        return "Квитанція";
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String KtoPidpusav() {
        return "Natalia Ivanivna";
    }
}
