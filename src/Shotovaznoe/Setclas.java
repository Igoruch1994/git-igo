package Shotovaznoe;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Igoruch on 19.02.2016.
 */
public class Setclas extends JFrame {
    JEditorPane pane;
    Setclas(String d){
        super(d);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        JButton button=new JButton("KNOPka");
        button.setSize(100,50);
        button.setLocation(180,300);
        button.setBackground(Color.GREEN);
        pane=new JEditorPane();


        pane.setCaretColor(Color.YELLOW);

        add(button);
        add(pane);


    }
}
