package Bilyk_lab_4;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class Ingenee extends Wokers {
    String salary;

    public Ingenee(String salary) {
        this.salary = salary;
    }
    public Ingenee(){
        salary="Зарплату не вказано";
    }

    @Override
    public String getName() {
        return "Ingenee";
    }

    @Override
    public String getNumberOffice() {
        return "3";
    }

    @Override
    public String getSalary() {
        return salary;
    }
}
