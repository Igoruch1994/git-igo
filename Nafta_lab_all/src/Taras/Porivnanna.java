package Taras;

/**
 * Created by Igoruch on 5/25/2016.
 */
public class Porivnanna {
    public boolean CompareAge(A a,B b){
        if (a.age==b.age){
            return true;
        }else return false;
    }
    public boolean CompareClassName(A a,B b){
        if (a.className==b.className){
            return true;
        }else return false;
    }
    public void PorivnannaObject(boolean a,boolean b){
        if (a&&b){
            System.out.println("Об'єкти однакові за змістом");
        }
        else System.out.println("Обєкти не однакові за змістом");
    }

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        Porivnanna porivnanna=new Porivnanna();
        boolean aa= porivnanna.CompareAge(a,b);
        boolean bb=porivnanna.CompareClassName(a,b);
        porivnanna.PorivnannaObject(aa,bb);
    }
}



