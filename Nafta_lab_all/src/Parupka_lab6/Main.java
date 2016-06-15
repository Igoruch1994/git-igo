package Parupka_lab6;

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
        Parupka_lab6.B b = new B(a, B);
        b.d = 5;
        for (int i=0;i<10;i++){
            b.f=b.f*b.d*b.a*b.b;
            b.getFOnDisplay();
        }

        b.getFOnDisplay();

    }
}
