package Shkolnik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igoruch on 05.04.2016.
 */
public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader  reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("a");
        double a=Double.parseDouble(reader.readLine());
        System.out.println("b");
        double b=Double.parseDouble(reader.readLine());
        double c=d(a,b);
        System.out.println("C= "+c);
        double f=f(c);
        System.out.println("F= "+f);
    }
    public static double d(double a,double b){
        double f=a-(((a*a*a-a*a-a+1)*(b-a))/((b*b*b-b*b-b+1)-(a*a*a-a*a-a+1)));
        return f;
    }

    public static double f(double a){
        double d=a*a*a-a*a-a+1;
        return d;
    }
}
