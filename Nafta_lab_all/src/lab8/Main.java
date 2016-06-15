package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Igoruch on 22.03.2016.
 */
public class Main {
    static Set<Character> set1=new HashSet<>();
    static Set<Character> set2=new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        set1.add('l');
        set1.add('a');
        set1.add('b');
        set1.add('8');
        set2.add('l');
        set2.add('i');
        set2.add('b');
        set2.add('8');


            System.out.println("Введіть '-', якщо потрібно видалити елемент з множини1 та множини2.\nВведіть '<', якщо потрібно порівняти елементи множин:");
            String str = reader.readLine();
            if (str.equals("-")) {
                for (Character s : set1) {
                    set1.remove(s);
                    System.out.println("Видалено!");
                    break;
                }
                for (Character d : set2) {
                    set2.remove(d);
                    break;
                }
            } else if (str.equals("<")) {
                for (Character s : set1) {
                    for (Character f : set2) {
                        if (s < f) {
                            System.out.println(s + "<" + f);
                        } else System.out.println(s + ">" + f);
                    }
                }
            } else System.out.println("Введено невірний символ");
    }
}
