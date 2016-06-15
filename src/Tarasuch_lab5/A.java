package Tarasuch_lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class A {
    private static int a;
    private static int b;

    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input value a:");
            a=Integer.parseInt(reader.readLine());
            System.out.println("Input  value b:");
            b=Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bilshe(int a,int b){
        int c;
        if (a>b){
            c=a;
        }else {
            c=b;
        }
        soutB(c);
    }
    public void bilsheRivne(int a,int b){
        int c;
        if (a>=b){
           c=a;
        }else {
            c=b;
        }
        soutBD(c);
    }

    public static void soutB(int d){
        System.out.println("Більше число " + d );
    }
    public static void soutBD(int d){
        System.out.println("Число більше рівне " + d );
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.bilshe(a,b);
        a1.bilsheRivne(a,b);
    }
}
