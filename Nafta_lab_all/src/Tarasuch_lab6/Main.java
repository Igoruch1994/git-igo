package Tarasuch_lab6;

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
        Tarasuch_lab6.B b = new B(a, B);
        b.d = 5;
        do {
            b.f+=b.d+b.a+b.b;
            --b.d;
        }
        while (b.d>0);

        b.getFOnDisplay();

    }
}
