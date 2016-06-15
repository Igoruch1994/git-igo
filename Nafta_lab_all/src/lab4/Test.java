package lab4;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Test extends Education {
    String timeEducation;
    public Test(){
        timeEducation="Час не вказано!";
    }
    public Test(String timeEducation){
        this.timeEducation=timeEducation;
    }

    public Test(Test test){
        this(test.getTimeEducation());
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
        return "Test";
    }
}
