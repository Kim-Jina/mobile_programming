/**
 * Created by 진아 on 2016-11-06.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class assignment3_4 {
    JFrame frame;               // JFrame object
    JLabel u_label, d_label;   // JLabel objects
    JPanel panel;                // JPanel object
    JCheckBox c1,c2,c3,c4,c5;   // JCheckBox object
    public static void main(String[] args){
        System.out.println("2014722057 김진아");   // print ID and name
        assignment3_4 gui=new assignment3_4();  // assignment3_3 object
        gui.go();   // move to go function
    }
    public void go(){
        frame=new JFrame(); // JFrame object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new JPanel(); // JPanel object
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        // declare five JCheckBox objects
        c1=new JCheckBox("Pizza         10,000");
        c2=new JCheckBox("Oil pasta     7,500");
        c3=new JCheckBox("Seafood pasta 8,000");
        c4=new JCheckBox("Fried rice    6,000");
        c5=new JCheckBox("Noodle        4,000");
        c1.addActionListener(new Listener());
        c2.addActionListener(new Listener());
        c3.addActionListener(new Listener());
        c4.addActionListener(new Listener());
        c5.addActionListener(new Listener());
        // make labels
        u_label=new JLabel("2014722057 김진아");
        d_label=new JLabel("The total is 0");
        // locate frames
        frame.getContentPane().add(BorderLayout.NORTH,u_label);
        frame.getContentPane().add(BorderLayout.SOUTH,d_label);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);
        // set frame's size
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    class Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){
            String total_cost;  // total cost
            int cost=0;         // cost
            // handle the event whether item is checked
            if(c1.isSelected())
                cost+=10000;
            if(c2.isSelected())
                cost+=7500;
            if(c3.isSelected())
                cost+=8000;
            if(c4.isSelected())
                cost+=6000;
            if(c5.isSelected())
                cost+=4000;
            total_cost=String.format("%,d",cost);   // make total cost
            d_label.setText("The total is "+total_cost);   // write label
        }
    }
}
