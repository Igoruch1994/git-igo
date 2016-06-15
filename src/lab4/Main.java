package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Pipe;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        List<Education> list = new LinkedList<>();
        System.out.println("Дата для тесту відома?");
        String a=reader.readLine();
        if (a.equals("Y")){
            System.out.println("Введіть дату випробування для тесту:");
            list.add(new Test(reader.readLine()));
        }
        else {list.add(new Colokvium());}

        System.out.println("Дата для колоквіуму відома?");
        String b=reader.readLine();
        if (b.equals("Y")){
            System.out.println("Введіть дату випробування для колоквіуму:");
            list.add(new Colokvium(reader.readLine()));
        }
        else {list.add(new Colokvium());}

        System.out.println("Дата для екзамену відома?");
        String c=reader.readLine();
        if (c.equals("Y")){
            System.out.println("Введіть дату випробування для екзамену:");
            list.add(new Exam(reader.readLine()));
        }
        else {list.add(new Exam());}

        System.out.println("Дата для випробування відома?");
        String d=reader.readLine();
        if (d.equals("Y")){
            System.out.println("Введіть дату для випробування:");
            list.add(new Trial(reader.readLine()));
        }
        else {list.add(new Trial());}

        for (int i = 0; i <list.size() ; i++) {
            System.out.print("Вид випробування: "+list.get(i).getTypeName()+" | назва дисципліни: "+list.get(i).getLessonName()+" | Дата випробування: "+list.get(i).getTimeEducation()+"\n");
        }
    }
}
