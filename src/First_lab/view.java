package First_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igoruch on 19.02.2016.
 */
public class view extends JFrame {

        JRadioButton jrb;
        JButton b1, b2;
        JLabel l1, l2, l3,l4;
        JTextField t1, t2;
        int i,k;
        String a,b;
        eHandler handler = new eHandler();

        public view(String s){
            super(s);
            setLayout(new FlowLayout());
            jrb = new JRadioButton();
            b1 = new JButton("Очистити");
            b2 = new JButton("Підрахувати");
            l1 = new JLabel("Введіть перше число: ");
            l2 = new JLabel("Введіть друге число: ");
            l3 = new JLabel("");
            l4 = new JLabel("");
            t1 = new JTextField(10);
            t2 = new JTextField(10);
            add(t1);
            add(l1);
            add(t2);
            add(l2);
            add(b2);
            add(b1);
            add(l3);
            add(l4);
            add(jrb);
            b1.addActionListener(handler);
            b2.addActionListener(handler);
        }

        public class eHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b2) {
                        i = Integer.parseInt(t1.getText());
                        k = Integer.parseInt(t2.getText());
                        i++;
                        k++;
                        a = "Нове перше число: " + i;
                        b = "Нове другее число: " + k;
                        l3.setText(a);
                        l4.setText(b);
                    }

                    if (e.getSource() == b1) {
                        t1.setText(null);
                        t2.setText(null);
                        l3.setText("");
                        l4.setText("");
                    }
                }catch (Exception ex){JOptionPane.showMessageDialog(null, "Введіть в поле число");}
            }
        }
    }


