package lab3;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Official {
    private int age;
    private  int experience;
    char[] name= {};

    public Official(int age, int experience, char[] name) {
        this.age = age;
        this.experience = experience;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public char[] getName() {
        return name;
    }
}
