package Tarasuch_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        List<Spilne> list = new LinkedList<>();

        System.out.println("Дата накладної відома?");
        String a=reader.readLine();
        if (a.equals("Y")){
            System.out.println("Введіть дату :");
            list.add(new Nakladna(reader.readLine()));
        }
        else {list.add(new Nakladna());
        }
        //-----------------------
        System.out.println("Дата документа відома?");
        String b=reader.readLine();
        if (b.equals("Y")){
            System.out.println("Введіть дату :");
            list.add(new Dokument(reader.readLine()));
        }
        else {list.add(new Dokument());
        }
        //----------------------------
        System.out.println("Дата квитанції відома?");
        String c=reader.readLine();
        if (c.equals("Y")){
            System.out.println("Введіть дату :");
            list.add(new Kvitancia(reader.readLine()));
        }
        else {list.add(new Kvitancia());
        }
        //--------------------------
        System.out.println("Дата чеку відома?");
        String d=reader.readLine();
        if (d.equals("Y")){
            System.out.println("Введіть дату :");
            list.add(new Chek(reader.readLine()));
        }
        else {list.add(new Chek());
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.print("Вид докумету: "+list.get(i).getTypeName()+" | Дата: "+list.get(i).getDate()+" | Хто підписав: "+list.get(i).KtoPidpusav()+"\n");
        }
    }
}
