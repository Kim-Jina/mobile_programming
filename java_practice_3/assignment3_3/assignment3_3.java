/**
 * Created by 진아 on 2016-11-06.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class assignment3_3 {
    JFrame frame;               // JFrame object
    JLabel u_label, d_label;   // JLabel objects
    int die1,die2;              // two dies
    public static void main(String[] args){
        System.out.println("2014722057 김진아");   // print ID and name
        assignment3_3 gui=new assignment3_3();  // assignment3_3 object
        gui.go();   // move to go function
    }
    public void go(){
        frame=new JFrame(); // JFrame object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make labels
        u_label=new JLabel("2014722057 김진아");
        d_label=new JLabel("The sum is "+Sum());
        MyDrawPanel panel=new MyDrawPanel();    // MyDrawPanel object
        panel.addMouseListener(new Listener());
        // locate frames
        frame.getContentPane().add(BorderLayout.NORTH,u_label);
        frame.getContentPane().add(BorderLayout.SOUTH,d_label);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        // set frame's size
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public int Sum(){   // calculate sum of two dies
        die1=(int)(Math.random()*6)+1;  // the first die
        die2=(int)(Math.random()*6)+1;  // the second die
        return die1+die2;   // return sum
    }
    class Listener implements MouseListener{      // inner class
        public void mouseClicked(MouseEvent e) {
            d_label.setText("The sum is "+Sum());   // write label
            frame.repaint();    // go to paintComponent function
        }
        public void mousePressed(MouseEvent e) { }
        public void mouseReleased(MouseEvent e) { }
        public void mouseEntered(MouseEvent e) { }
        public void mouseExited(MouseEvent e) {  }
    }
    public class MyDrawPanel extends JPanel {   // inner class
        public void paintComponent(Graphics g){ // paint component
            int x1=10,x2=100,y1=25,y2=125;    // two x and two y
            g.drawRect(x1,y1,80,80);        // draw rectangle
            paintCircle(g,x1,y1,die1);    // go to paintCircle function
            g.drawRect(x2,y2,80,80);        // draw rectangle
            paintCircle(g,x2,y2,die2);    // go to paintCircle function
        }
        public void paintCircle(Graphics g, int x, int y, int die){ // paint circle in die
            if(die==1){     // die's value is one
                g.fillOval(x+35,y+35,10,10);
            }
            else if(die==2){    // die's value is two
                g.fillOval(x+15,y+35,10,10);
                g.fillOval(x+55,y+35,10,10);
            }
            else if(die==3){    // die's value is three
                g.fillOval(x+15,y+35,10,10);
                g.fillOval(x+35,y+35,10,10);
                g.fillOval(x+55,y+35,10,10);
            }
            else if(die==4){    // die's value is four
                g.fillOval(x+15,y+55,10,10);
                g.fillOval(x+55,y+55,10,10);
                g.fillOval(x+15,y+15,10,10);
                g.fillOval(x+55,y+15,10,10);
            }
            else if(die==5){    // die's value is five
                g.fillOval(x+15,y+55,10,10);
                g.fillOval(x+55,y+55,10,10);
                g.fillOval(x+35,y+35,10,10);
                g.fillOval(x+15,y+15,10,10);
                g.fillOval(x+55,y+15,10,10);
            }
            else{       // die's value is six
                g.fillOval(x+15,y+55,10,10);
                g.fillOval(x+55,y+55,10,10);
                g.fillOval(x+15,y+15,10,10);
                g.fillOval(x+55,y+15,10,10);
                g.fillOval(x+35,y+55,10,10);
                g.fillOval(x+35,y+15,10,10);
            }
        }
    }
}
