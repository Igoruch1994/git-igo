package lab2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Igoruch on 15.03.2016.
 */
public class Lab extends Applet implements MouseWheelListener,MouseListener {

    int X=0;
    int Y=0;
    int W=30;
    int H=40;
    int valX=0;
    int valY=10;


    public void init(){
        addMouseWheelListener(this);
    }
    public void paint(Graphics d){
        d.fillOval(X,Y,W,H);
        setBackground(Color.blue);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if  (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL){
            X=X+valX;
            Y=Y+valY;
            W=W+15;
            H=H+15;
        }

        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if  (e.getButton() == MouseEvent.MOUSE_CLICKED){
            X=X+valX;
            Y=Y+valY;
            W=W+15;
            H=H+15;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
