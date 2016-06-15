package lab4;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Trial extends Education {
    String timeEducation;
    public Trial(){
        timeEducation="Час не вказано!";
    }
    public Trial(String timeEducation){
        this.timeEducation=timeEducation;
    }

    public Trial(Trial trial){
        this(trial.getTimeEducation());
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
        return "Trial";
    }
}
