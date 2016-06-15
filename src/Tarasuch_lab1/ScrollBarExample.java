package Tarasuch_lab1;

import javax.swing.*;

import java.util.Timer;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.*;

/**
 * Created by Igoruch on 4/26/2016.
 */
public class ScrollBarExample extends JPanel {
    JLabel label;

    public ScrollBarExample() {
        super(true);
        label=new JLabel();
        setLayout(new BorderLayout());

        JScrollBar hbar=new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 300);


        hbar.setUnitIncrement(2);
        hbar.setBlockIncrement(1);

        hbar.addAdjustmentListener(new MyAdjustmentListener());

        add(hbar, BorderLayout.SOUTH);
        add(label, BorderLayout.CENTER);
    }
    public ScrollBarExample(String a) {
        super(true);
        label=new JLabel();
        setLayout(new BorderLayout());


        JScrollBar vbar=new JScrollBar(JScrollBar.VERTICAL, 30, 20, 0, 300);

        vbar.setUnitIncrement(2);
        vbar.setBlockIncrement(1);

        vbar.addAdjustmentListener(new MyAdjustmentListener());


        add(vbar, BorderLayout.EAST);
        add(label, BorderLayout.CENTER);
    }

    class MyAdjustmentListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e) {
            label.setText("    New Value is " + e.getValue() + "      ");
            repaint();
        }
    }
    public ScrollBarExample(String a,String c) {
        super(true);
        label=new JLabel();
        setLayout(new BorderLayout());


        JScrollBar vbar=new JScrollBar(JScrollBar.VERTICAL, 20, 20, 0, 200);

        vbar.setBackground(Color.green);
        vbar.setUnitIncrement(2);
        vbar.setBlockIncrement(1);

        vbar.addAdjustmentListener(new MyAdjustmentListener());


        add(vbar, BorderLayout.EAST);
        add(label, BorderLayout.CENTER);
    }

    public static void main(String s[]) {

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                int a=(int)(Math.random()*10);
                if (a<3){
                    JFrame frame = new JFrame("Scroll Bar Example");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setContentPane(new ScrollBarExample());
                    frame.setSize(300,300);
                    frame.setVisible(true);
                }
                else if (a>3&&a<6){
                    String d="ll";
                    JFrame frame = new JFrame("Scroll Bar Example");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setContentPane(new ScrollBarExample(d));
                    frame.setSize(300,300);
                    frame.setVisible(true);
                }
                else {
                    String d="ll";
                    JFrame frame = new JFrame("Scroll Bar Example");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setContentPane(new ScrollBarExample(d,d));
                    frame.setSize(300,300);
                    frame.setVisible(true);
                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,200,200);
    }
}
