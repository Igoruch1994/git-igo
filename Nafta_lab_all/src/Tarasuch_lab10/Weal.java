package Tarasuch_lab10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * Created by Igoruch on 5/12/2016.
 */
public class Weal extends Applet implements MouseWheelListener {
    int X=0;
    int Y=0;
    int W=30;
    int H=50;
    int valX=0;
    int valY=0;
    public void init(){
        addMouseWheelListener(this);
    }
    public void paint(Graphics d){
        d.fillRect(X,Y,W,H);
        setBackground(Color.white);
    }
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if  (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL){
            X=X+valX;
            Y=Y+valY;
            W=W+10;
            H=H+10;
        }
        else if(e.getScrollType() == MouseWheelEvent.WHEEL_BLOCK_SCROLL){
            X=X-valX;
            Y=Y-valY;
            W=W-10;
            H=H-10;
        }
        repaint();
    }
}
