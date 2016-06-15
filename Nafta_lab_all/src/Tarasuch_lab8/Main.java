package Tarasuch_lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        boolean s=true;
        while ( s) {
            System.out.println("Для того ,щоб видалити елемент введіть - , для того щоб додати елемент введіть+");
            String a = reader.readLine();
            switch (a) {
                case "+":
                    System.out.println("введіть назву");
                    list.add(reader.readLine());
                    System.out.println("Добавлено");
                    break;
                case "-":
                    list.remove(0);
                    System.out.println("Видалено");
                    break;
                default:
                    System.out.println("Невірний знак");
                    break;
            }
        }
    }
}
