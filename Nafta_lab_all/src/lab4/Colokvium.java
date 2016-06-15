package lab4;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Colokvium extends Education {

    String timeEducation;
    public Colokvium(){
        timeEducation="Час не вказано!";
    }
    public Colokvium(String timeEducation){
        this.timeEducation=timeEducation;
    }

    public Colokvium(Colokvium colokvium){
        this(colokvium.getTimeEducation());
    }
    @Override
    public String getTimeEducation(){
        return timeEducation;
    }

    @Override
    public String getLessonName() {
        return "OOP";
    }

    @Override
    public String getTypeName() {
        return "Colokvium";
    }


}
