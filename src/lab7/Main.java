package lab7;

import lab6.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 19.03.2016.
 */
public class Main {
    static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            System.out.println("Ведіть змінну a");
            int aaa=Integer.parseInt(reader.readLine());
            System.out.println("Ведіть змінну b");
            int beee=Integer.parseInt(reader.readLine());
            System.out.println("Введіть змінну f");
            int efka=Integer.parseInt(reader.readLine());
            B b=new B(aaa,beee,efka);
            b.d= Math.random()*100+1;
            int hah=0;
            while (hah<5){
                b.f+=b.a*b.b/b.d;
                hah++;
            }
            b.getFOnDisplay();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
