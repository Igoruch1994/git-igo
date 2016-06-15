package Shotovaznoe;

/**
 * Created by Igoruch on 19.02.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;
import java.util.Timer;

public class Main {
    public static void main(String [] args){
        final Setclas setclas=new Setclas("hahahhahaha");
        setclas.setVisible(true);
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                int a=(int)(Math.random()*10);
                if (a<3){
                    setclas.pane.setBackground(Color.RED);
                }
                else if (a>3&&a<6){
                    setclas.pane.setBackground(Color.BLACK);
                }
                else {
                    setclas.pane.setBackground(Color.blue);
                }
            }
        };
        TimerTask task1=new TimerTask() {
            @Override
            public void run() {
                int a=(int)(Math.random()*10);
                if (a<3){
                    setclas.pane.setLocation(42,90);
                }
                else if (a>3&&a<6){
                    setclas.pane.setLocation(50,60);
                }
                else {
                    setclas.pane.setLocation(22,16);
                }
            }
        };
        TimerTask task2=new TimerTask() {
            @Override
            public void run() {
                int a=(int)(Math.random()*10);
                if (a<3){
                    setclas.pane.setSize(400,100);
                }
                else if (a>3&&a<6){
                    setclas.pane.setSize(300,200);
                }
                else {
                    setclas.pane.setSize(100,100);
                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(task1,200,200);
        Timer timer1=new Timer();
        timer1.schedule(task,200,200);
        Timer timer2=new Timer();
        timer2.schedule(task2,200,200);

    }
}
