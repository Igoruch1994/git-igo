package lab7;

/**
 * Created by Igoruch on 19.03.2016.
 */
public class B extends A {

    public double d;
    public double f=0;
    int[] arrayka=new int[a];

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
        for (int i = 0; i <arrayka.length ; i++) {
            arrayka[i]=f*i;
        }
    }

    public void getFOnDisplay(){
        System.out.println(this.f);
    }
}
