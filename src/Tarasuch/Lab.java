package Tarasuch;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Lab extends Applet implements KeyListener {

    int X=0;
    int Y=0;
    int W=40;
    int H=30;
    int valX=0;
    int valY=0;


    public void init(){
        addKeyListener(this);
    }
    public void paint(Graphics d){
        d.fillRect(X,Y,W,H);
        setBackground(Color.GREEN);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        valX=20;
        valY=20;
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        if (key==KeyEvent.VK_CAPS_LOCK){
            X=X+valX;
            Y=Y+valY;
            W=W+10;
            H=H+10;
        }
        else if (key==KeyEvent.VK_SHIFT){
            X=X-valX;
            Y=Y-valY;
            W=W-10;
            H=H-10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
