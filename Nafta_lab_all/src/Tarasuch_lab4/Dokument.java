package Tarasuch_lab4;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Dokument extends Spilne {
    String date;
    public Dokument(){
        date="Не вказано";
    }
    public Dokument(String a){
        date=a;
    }
    @Override
    public String getTypeName() {
        return "Документ";
    }
    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String KtoPidpusav() {
        return "Lidia Omelianivna";
    }
}
