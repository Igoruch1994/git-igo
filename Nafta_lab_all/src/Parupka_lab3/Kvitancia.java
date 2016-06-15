package Parupka_lab3;

/**
 * Created by Igoruch on 4/30/2016.
 */
public class Kvitancia {
    char[] name;
    int data1;
    int data2;
    int data3;
    float sum;

    public Kvitancia(char[] name, int data1, int data2, int data3, float sum) {
        this.name = name;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.sum = sum;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public int getData3() {
        return data3;
    }

    public void setData3(int data3) {
        this.data3 = data3;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}
