package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 18.03.2016.
 */
public class A {
    private static int a;
    private static int b;

    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input value a:");
            a=Integer.parseInt(reader.readLine());
            System.out.println("Input value b:");
            b=Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int inc(int d){
        int input = d;
        d++;
        soutInc(d, input);
        return d;
    }
    public int dec(int d){
        int input = d;
        d--;
        soutDec(d, input);
        return d;
    }

    public static void soutInc(int d, int input){
        System.out.println("Input variable x=" + input + ", incremented variable y=" + d +".");
    }
    public static void soutDec(int d, int input){
        System.out.println("Input variable x=" + input + ", decremented variable y=" + d +".");
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.inc(a);
        a1.inc(b);
        a1.dec(a);
        a1.dec(b);
    }
}
