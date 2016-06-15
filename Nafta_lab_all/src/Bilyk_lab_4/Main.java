package Bilyk_lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        List<Wokers> list = new LinkedList<>();
        System.out.println("Заплата робітника відома?(Y/N)");
        String a=reader.readLine();
        if (a.equals("Y")){
            System.out.println("Введіть величину зарплати");
            list.add(new woker(reader.readLine()));
        }
        else {list.add(new woker());}

        //---------------------
        System.out.println("Заплата інженера відома?(Y/N)");
        String b=reader.readLine();
        if (b.equals("Y")){
            System.out.println("Введіть величину зарплати");
            list.add(new Ingenee(reader.readLine()));
        }
        else {list.add(new Ingenee());}
        //-------------------
        System.out.println("Заплата кадра відома?(Y/N)");
        String c=reader.readLine();
        if (c.equals("Y")){
            System.out.println("Введіть величину зарплати");
            list.add(new Frame(reader.readLine()));
        }
        else {list.add(new Frame());}
        //---------------
        System.out.println("Заплата адміністратора відома?(Y/N)");
        String d=reader.readLine();
        if (d.equals("Y")){
            System.out.println("Введіть величину зарплати");
            list.add(new Admin(reader.readLine()));
        }
        else {list.add(new Admin());}

        //--------------
        for (int i = 0; i <list.size() ; i++) {
            System.out.print("Посада працівника:" +list.get(i).getName()+" | номер офісу: "+list.get(i).getNumberOffice()+" | Величина зарплати: "+list.get(i).getSalary()+"\n");
        }
    }
}
