package Parupka_lab4;

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

        List<Spilka> list = new LinkedList<>();
        System.out.println("Ціна для іграшки відома?");
        String a=reader.readLine();
        if (a.equals("Y")){
            System.out.println("Введіть ціну:");
            list.add(new Toy(reader.readLine()));
        }
        else {list.add(new Toy());}
        //=================
        System.out.println("Ціна для деталі відома?");
        String b=reader.readLine();
        if (b.equals("Y")){
            System.out.println("Введіть ціну:");
            list.add(new Detal(reader.readLine()));
        }
        else {list.add(new Detal());}
        //=================
        System.out.println("Ціна для інструмента відома?");
        String c=reader.readLine();
        if (c.equals("Y")){
            System.out.println("Введіть ціну:");
            list.add(new Instrooment(reader.readLine()));
        }
        else {list.add(new Instrooment());}
        //=================
        System.out.println("Ціна для виробу відома?");
        String d=reader.readLine();
        if (d.equals("Y")){
            System.out.println("Введіть ціну:");
            list.add(new Vurib(reader.readLine()));
        }
        else {list.add(new Vurib());}
        for (int i = 0; i <list.size() ; i++) {
            System.out.print("Назва продукту: "+list.get(i).Name()+" | ціна: "+list.get(i).ToyCost()+"\n");
        }
    }
}
