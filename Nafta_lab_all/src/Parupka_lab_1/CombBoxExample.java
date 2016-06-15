package Parupka_lab_1;

/**
 * Created by Igoruch on 4/29/2016.
 */
import java.util.Timer;

import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.event.*;

class CombBoxExample extends JFrame implements  ItemListener
{
    private	JComboBox	combo;

    final   String[]    sList =
            {
                    "Canada",
                    "USA",
                    "Australia",
                    "Bolivia",
                    "Denmark",
                    "Japan"
            };
    public CombBoxExample()
    {
    }
    //----------------------------------
    public void Parupka(String a){
        if (a.equals("c")){
            sList[0]="Parupka";
        }
        else {
            sList[0]="Canada";
        }
        setTitle( "ComboBox Application" );
        if (a.equals("b")){
        setSize( 500, 310 );
        } else {
            setSize( 400, 410 );
        }
        setBackground( Color.gray );
        getContentPane().setLayout( new BorderLayout() );

        JPanel topPanel = new JPanel();
        topPanel.setLayout( null );
        getContentPane().add( topPanel, BorderLayout.CENTER );
        JComboBox combo = new JComboBox();
        // Create a combobox
        if (a.equals("a")) {

            combo.setBounds(20, 35, 260, 20);
            topPanel.add(combo);
        }
        else {
            combo.setBounds(30, 35, 260, 40);
            topPanel.add(combo);
        }
        // Populate the combobox list
        for( int iCtr = 0; iCtr < sList.length; iCtr++ )
            combo.addItem( sList[iCtr] );

        // Allow edits
        combo.setEditable( true );

        // Watch for changes
        combo.addItemListener( this );
    }
    //----------------------------------
    public void itemStateChanged( ItemEvent event )
    {
        if( event.getSource() == combo
                && event.getStateChange() == ItemEvent.SELECTED )
        {
            System.out.println( "Change:"
                    + combo.getSelectedItem() );
        }
    }

    public static void main( String args[] )
    {
        // Create an instance of the test application
        CombBoxExample mainFrame	= new CombBoxExample();
        TimerTask task=new TimerTask() {

            @Override
            public void run() {
                int a=(int)(Math.random()*10);
                if (a<3){
                    mainFrame.setVisible( true );
                    mainFrame.Parupka("a");
                }
                else if (a>3&&a<6){
                    mainFrame.setVisible( true );
                    mainFrame.Parupka("b");
                }
                else {
                    mainFrame.setVisible( true );
                    mainFrame.Parupka("c");
                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,200,200);
    }
    }

