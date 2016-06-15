package lab_7_Bilyk;

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
        int f=Integer.parseInt(reader.readLine());
        lab_7_Bilyk.B b = new B(a, B,f);
        b.d = (int) (Math.random() * 10);

        switch (b.d){
            case 0:b.f=a+B;
                break;
            case 1:b.f=a*B+a;
                break;
            case 2:b.f=a*B-B;
                break;
            case 3:b.f=a*B*B;
                break;
            case 4:b.f=a*B+a-B;
                break;
            case 5:b.f=a*B/a;
                break;
            case 6:b.f=a*B*a*a;
                break;
            case 7:b.f=a*B*B*B;
                break;
            case 8:b.f=a-B;
                break;
            case 9:b.f=a/B;
                break;
                default:
                    System.out.println("Не співпало!");
                    break;
        }
        b.getFOnDisplay();
        b.getArray();
    }
}
