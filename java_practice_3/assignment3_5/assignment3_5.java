/**
 * Created by 진아 on 2016-11-06.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.nio.Buffer;
import java.util.*;
import java.util.concurrent.ThreadFactory;
public class assignment3_5 {
    JFrame frame;                            // JFrame
    JPanel mainPanel,subPanel,e_panel;   // JPanel
    JScrollPane qScroller;                 // JScrollerPane
    JTextArea incoming;                    // JTextArea
    JTextField outgoing;                  // JTextField
    BufferedReader reader;                  // BufferedReader
    PrintWriter writer;                     // PrintWriter
    Socket sock;                             // Socket
    int make=0;                             // make
    int index=0;                            // index
    public static void main(String args[]){
        System.out.println("2014722057 김진아");   // print ID and name
        assignment3_5 client=new assignment3_5();   // assignment3_5 object
        client.go();
    }
    public void go(){
        frame=new JFrame("Chat client program");   // make frame
        // make panel
        mainPanel=new JPanel();
        subPanel=new JPanel();
        e_panel = new JPanel();
        incoming=new JTextArea(15,50);             // 15 lines, 50 columns
        incoming.setLineWrap(true);                // turn on line wrapping
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make scroll pane
        qScroller=new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing=new JTextField(20);        // make 20 columns
        JButton sendButton=new JButton("Send"); // make send button
        // operate event
        outgoing.addActionListener(new Listener());
        sendButton.addActionListener(new Listener());
        //////////////////// addition ////////////////////////////////////////////////////////////
        JButton emotionButton=new JButton("☻");                     // make emotion button
        emotionButton.addActionListener(new emotion_Listener());    // operate event
        //////////////////////////////////////////////////////////////////////////////////////
        // add outgoing, emotionButton, sendButton in subPanel
        subPanel.add(outgoing);
        ///////////// addition ////////////////////////
        subPanel.add(emotionButton);
        //////////////////////////////////////////////
        subPanel.add(sendButton);
        mainPanel.setLayout((new BoxLayout(mainPanel,BoxLayout.Y_AXIS)));
        // add qScroller, subPanel in mainPanel
        mainPanel.add(qScroller);
        mainPanel.add(subPanel);
        setUpNetworking();          // go to setUpNetworking function
        // make thread and start
        Thread m_thread=new Thread(new Reader());
        Thread o_thread=new Thread(new Reader());
        m_thread.setName("2014722057 김진아");
        o_thread.setName("Mobile programming");
        m_thread.start();
        o_thread.start();
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);  // locate frames
        // set frame's size
        frame.setSize(400,500);
        frame.setVisible(true);
    }
    private void setUpNetworking(){ // networking
        try{
            sock=new Socket("127.0.0.1",5000);    // make socket
            InputStreamReader streamReader=new InputStreamReader(sock.getInputStream());  // InputStreamReader object
            reader=new BufferedReader(streamReader);    // BufferedReader object
            writer=new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        }catch(IOException ex){ // operate IO exception
            ex.printStackTrace();
        }
    }
    class Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e) { // handle event
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {   // operate exception
                ex.printStackTrace();
            }
            outgoing.setText("");      // clear the field
            outgoing.requestFocus();   // put the cursor back in the field
            e_panel.setVisible(false);  // invisible
        }
    }
    ////////////////////// Addition ////////////////////////////////////////////
    class emotion_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e) { // handle event
            if (make == 0) {
                // make panel
                JPanel e_panel1 = new JPanel();
                JPanel e_panel2 = new JPanel();
                // make 10 emotions
                JButton e1 = new JButton("★");
                JButton e2 = new JButton("♥");
                JButton e3 = new JButton("☺");
                JButton e4 = new JButton("✿");
                JButton e5 = new JButton("☀");
                JButton e6 = new JButton("；◔д◔");
                JButton e7 = new JButton("◕‿◕✿");
                JButton e8 = new JButton("◕ε◕");
                JButton e9 = new JButton("◕_◕");
                JButton e10 = new JButton("◕,.◕");
                // handle event
                e1.addActionListener(new e1_Listener());
                e2.addActionListener(new e2_Listener());
                e3.addActionListener(new e3_Listener());
                e4.addActionListener(new e4_Listener());
                e5.addActionListener(new e5_Listener());
                e6.addActionListener(new e6_Listener());
                e7.addActionListener(new e7_Listener());
                e8.addActionListener(new e8_Listener());
                e9.addActionListener(new e9_Listener());
                e10.addActionListener(new e10_Listener());
                // add emotions in panel
                e_panel1.add(e1);
                e_panel1.add(e2);
                e_panel1.add(e3);
                e_panel1.add(e4);
                e_panel1.add(e5);
                e_panel2.add(e6);
                e_panel2.add(e7);
                e_panel2.add(e8);
                e_panel2.add(e9);
                e_panel2.add(e10);
                e_panel.setLayout((new BoxLayout(e_panel, BoxLayout.Y_AXIS)));
                e_panel.add(e_panel1);
                e_panel.add(e_panel2);
                // add e_panel in mainPanel
                mainPanel.add(e_panel);
                frame.getContentPane().add(BorderLayout.CENTER, mainPanel);  // locate frames
                frame.setVisible(true);
                make++;
            }
            e_panel.setVisible(true);   //  visible
        }
    }
    class e1_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"★");
        }
    }
    class e2_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"♥");
        }
    }
    class e3_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"☺");
        }
    }
    class e4_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"✿");
        }
    }
    class e5_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"☀");
        }
    }
    class e6_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"；◔д◔");
        }
    }
    class e7_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"◕‿◕✿");
        }
    }
    class e8_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"◕ε◕");
        }
    }
    class e9_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"◕_◕");
        }
    }
    class e10_Listener implements ActionListener {  // inner class
        public void actionPerformed(ActionEvent e){ // handle event
            outgoing.setText(outgoing.getText()+"◕,.◕");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public class Reader implements Runnable{
        public void run() {
            // message list and message
            String[] messageList={"Hello","Kwangwoon university","every Friday","참B103","The first and the second period","Bye"};
            String message;
            try{
                while ((message = reader.readLine()) != null) {   // read message
                    if(Thread.currentThread().getName().equals("Mobile programming")) { // Mobile programming
                        if(index==0){
                            incoming.append(Thread.currentThread().getName() + " > " + messageList[index++] + "\n");   // append to the text that's in it
                            incoming.append("2014722057 김진아 > " + message + "\n");   // append to the text that's in it
                        }
                        else if(index>messageList.length)
                            incoming.append("2014722057 김진아 > " + message + "\n");   // append to the text that's in it
                        else
                            incoming.append(Thread.currentThread().getName() + " > " + message + "\n");   // append to the text that's in it
                    }
                    else {              // 2014722057 김진아
                        System.out.println("read " + message);
                        incoming.append(Thread.currentThread().getName() + " > " + message + "\n");   // append to the text that's in it
                        if(index<messageList.length) { // save messageList
                            try {
                                writer.println(messageList[index++]);
                                writer.flush();
                            } catch (Exception ex) {   // operate exception
                                ex.printStackTrace();
                            }
                        }
                        else if(index==messageList.length) {
                            incoming.append("Mobile programming님이 나가셨습니다.\n");
                            index++;
                        }
                    }
                    try{    // postpone
                        Thread.sleep(20);
                    }catch(InterruptedException ex) {    // operate exception
                        ex.printStackTrace();
                    }
                }
            }catch(Exception ex) {   // operate exception
                ex.printStackTrace();
            }
        }
    }
}
