package Bilyk_lab_4;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class Frame extends Wokers {
    String salary;

    public Frame(String salary) {
        this.salary = salary;
    }
    public Frame(){
        salary="Зарплату не вказано";
    }

    @Override
    public String getName() {
        return "Frame";
    }

    @Override
    public String getNumberOffice() {
        return "2";
    }

    @Override
    public String getSalary() {
        return salary;
    }
}
