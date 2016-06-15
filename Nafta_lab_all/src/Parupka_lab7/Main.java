package Parupka_lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 18.03.2016.
 */
public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Ведіть змінну a");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Ведіть змінну b");
        int B = Integer.parseInt(reader.readLine());
        System.out.println("Введіть змінну f");
        int ef=Integer.parseInt(reader.readLine());
        B b=new B(a,B,ef);
        b.d = 5;
        for (int i=0;i<B;i++){
            b.f=b.f*b.d*b.a*b.b;
            b.getFOnDisplay();
        }

        b.getFOnDisplay();

    }
}
