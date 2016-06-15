package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Official> officials=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть ім*я службовця");
        String naim=reader.readLine();
        char[] chur=naim.toCharArray();
        System.out.println("Введіть вік службовця");
        int vik=Integer.parseInt(reader.readLine());
        System.out.println("Введіть стаж службовця");
        int stag=Integer.parseInt(reader.readLine());
        Official official=new Official(vik,stag,chur);
        officials.add(official);
        System.out.println("Службовець занесений у базу даних!");
        System.out.println("Ім*я: "+naim+" | Вік: "+vik+" | Стаж:"+stag);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Звільнити службовця?(Y/N)");
        String perevirka=reader.readLine();
        if (perevirka.equals("Y")){
            for (int i = 0; i <8 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            officials.remove(0);
            System.out.println("\nУспішно звільнено!!!");
        }
        else {
            System.out.println("Удачі!");
        }
    }
}
