package Parupka_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class A {
    private static float a;
    private static float b;

    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input  value a:");
            a=Float.parseFloat(reader.readLine());
            System.out.println("Input  value b:");
            b=Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public A() {
    }

    public void Logarufm(float a){
        float c;
        c=(float) Math.log(a);
        soutLog(c);
    }
    public void SerZnach(float a,float b){
        float c;
        c=(a+b)/2;
        soutSer(c);
    }

    public static void soutLog(float d){
        System.out.println("Логарифм числа " + d );
    }
    public static void soutSer(float d){
        System.out.println("Середнє значення " + d );
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.SerZnach(a,b);
        a1.Logarufm(a);
        a1.Logarufm(b);
    }
}
