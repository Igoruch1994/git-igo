package Bilyk_lab_4;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class woker extends Wokers{
    public String salary;

    public woker(String salary) {
        this.salary = salary;
    }
    public woker(){
        salary="Зарплату не вказано";
    }

    @Override
    public String getName() {
        return "Worker";
    }

    @Override
    public String getNumberOffice() {
        return "1";
    }

    @Override
    public String getSalary() {
        return salary;
    }
}
