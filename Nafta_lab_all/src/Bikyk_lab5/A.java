package Bikyk_lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class A {
    private static double a;
    private static double b;
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input value  a:");
            a=Integer.parseInt(reader.readLine());
            System.out.println("Input value  b:");
            b=Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public double Sqrt(double d){
        double input = d;
        d=Math.sqrt(d);
        soutSQRT(d, input);
        return d;
    }
    public double Pow(double d){
        double input = d;
        d=Math.pow(d,d);
        soutPow(d, input);
        return d;
    }
    public static void soutSQRT(double d, double input){
        System.out.println("Input variable x=" + input + ", sqrt variable y=" + d +".");
    }
    public static void soutPow(double d, double input){
        System.out.println("Input variable x=" + input + ",POW ecremented variable y=" + d +".");
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.Sqrt(a);
        a1.Sqrt(b);
        a1.Pow(a);
        a1.Pow(b);
    }
}
