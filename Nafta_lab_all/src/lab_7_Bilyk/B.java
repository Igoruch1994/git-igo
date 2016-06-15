package lab_7_Bilyk;

/**
 * Created by Igoruch on 18.03.2016.
 */
public class B extends A {
    public int d;
    public double f=0;
    int[] array=new int[a];

    public B(){
    }
    public B(int a,int b,int f){
        this(a, b);
        for (int i = 0; i <array.length ; i++) {
            array[i]=f*i;
        }
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
    public void getArray(){
        System.out.println("Вивід вмісту масиву:");
        for (int d:array){
            System.out.println(d);
        }
    }
}
