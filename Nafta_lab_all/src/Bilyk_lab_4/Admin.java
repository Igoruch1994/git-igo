package Bilyk_lab_4;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class Admin extends Wokers {
    String salary;

    public Admin(String salary) {
        this.salary = salary;
    }
    public Admin(){
        salary="Зарплату не вказано";
    }

    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public String getNumberOffice() {
        return "4";
    }

    @Override
    public String getSalary() {
        return salary;
    }
}
