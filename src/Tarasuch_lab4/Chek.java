package Tarasuch_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Chek extends Spilne {
    String date;
    public Chek(){
        date="Не вказано";
    }
    public Chek(String a){
        date=a;
    }
    @Override
    public String getTypeName() {
        return "Чек";
    }
    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String KtoPidpusav() {
        return "Svitlana Yaroslavivna";
    }
}
