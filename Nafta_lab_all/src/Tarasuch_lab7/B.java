package Tarasuch_lab7;

/**
 * Created by Igoruch on 18.03.2016.
 */
public class B extends A {
    public int d;
    public double f;
    int[] array=new int[a];

    public B(){
    }
    public B(int d){
        this.d=d;
    }

    public B(int a,int b){
        super(a,b);
    }
    public B(int a,int b,int f){
        this(a, b);
        for (int i = 0; i <array.length ; i++) {
            array[i]=f*i;
        }
    }


    public void getFOnDisplay(){
        System.out.println("Змінна F---> "+this.f);
        System.out.println("Массив:");
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
