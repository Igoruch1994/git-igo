package Tarasuch_lab3;

import lab3.Official;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Nachalnika> nachalnika=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть ім*я начальніка");
        String name=reader.readLine();
        char[] ima=name.toCharArray();
        System.out.println("Введіть посаду начальніка");
        String posada=reader.readLine();
        char[] posadka=posada.toCharArray();
        System.out.println("Введіть штат начальніка");
        String shtat=reader.readLine();
        int shtata=Integer.parseInt(shtat);
        Nachalnika nachalnika1=new Nachalnika(ima,shtata,posadka);
        nachalnika.add(nachalnika1);

        System.out.println("Начальнік занесений у базу даних!");
        System.out.println("Ім*я: "+name+" | Посада: "+posada+" | Штаб:"+shtat);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Звільнити начальніка?(Y/N)");
        String perevirka=reader.readLine();
        if (perevirka.equals("Y")||perevirka.equals("y")){
            for (int i = 0; i <8 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            nachalnika.remove(0);
            System.out.println("\nУспішно звільнено!!!");
        }
        else {
            System.out.println("Шо маємо то маємо");
        }

    }
}
