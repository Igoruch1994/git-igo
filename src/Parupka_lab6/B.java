package Parupka_lab6;

/**
 * Created by Igoruch on 18.03.2016.
 */
public class B extends A {
    public int d;
    public long f=1;

    public B(){
    }
    public B(int d){
        this.d=d;
    }
    public B(int a,int b){
        super(a,b);
    }

    public void getFOnDisplay(){
        System.out.println("Змінна F---> "+this.f);
    }
}
