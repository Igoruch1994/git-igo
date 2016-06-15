package Parupka_lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Kvitancia> kvitanc=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть назву квитанції");
        String naim=reader.readLine();
        char[] name=naim.toCharArray();
        System.out.println("Введіть дату(День) квитанції");
        int data1=Integer.parseInt(reader.readLine());
        System.out.println("Введіть дату(Місяць) квитанції");
        int data2=Integer.parseInt(reader.readLine());
        System.out.println("Введіть дату(Рік) квитанції");
        int data3=Integer.parseInt(reader.readLine());
        System.out.println("Введіть суму");
        float sum=Float.parseFloat(reader.readLine());
        Kvitancia kvitancia=new Kvitancia(name,data1,data2,data3,sum);
        kvitanc.add(kvitancia);

        System.out.println("Квитанція занесена у базу даних!");
        System.out.println("Назва: "+naim+" | Дата: "+data1+"."+data2+"."+data3+" | Сума:"+sum);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Видалити квитанцію?(Y/N)");
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
            kvitanc.remove(0);
            System.out.println("\nУспішно!!!");
        }
        else {
            System.out.println("Ну нє то нє!");
        }
    }
}
