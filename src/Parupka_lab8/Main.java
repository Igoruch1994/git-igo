package Parupka_lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Main {
   static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
   static ArrayList<String> list=new ArrayList<>();

    public static void listAdd() throws IOException {
        System.out.println("Введіть шось");
        list.add(reader.readLine());
    }
    public static void listRemove() throws IOException {
        list.remove(list.size()-1);
        System.out.println("Видалено");
    }
    public static void main(String[] args) throws IOException {
        boolean s=true;
        while (s){
            System.out.println("Введіть +,щоб додати елемент, або введіть -i щоб видалити");
            String a=reader.readLine();
            switch (a){
                case "+":listAdd();
                    System.out.println("Додано");
                    break;
                case "-i":listRemove();
                    default:
                        System.out.println("Невірний символ");
                        break;
            }
        }

    }
}
