/**
 * Created by Frank Hall on 6/25/2016.
 */
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class JNurseryRhyme extends JFrame //implements ActionLister
{
    JLabel msg1 = new JLabel("Jack and Jill Went Up The Hill");
    JLabel msg2 = new JLabel("To Fetch A Pail Of Water");
    JLabel msg3 = new JLabel("Jack Fell Down And Broke His Crown");
    JLabel msg4 = new JLabel("And Jill Came Tumbling After.");


    public JNurseryRhyme()
    {
        super("Nursery Rhyme");
        //setLayout(flow);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(msg1);
        add(msg2);
        add(msg3);
        add(msg4);
        setSize(300,150);
        setVisible(true);

    }

    public static void main(String[] args)
    {

        new JNurseryRhyme();

    }
}
