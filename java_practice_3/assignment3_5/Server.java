/**
 * Created by 진아 on 2016-11-06.
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
    ArrayList clientOutputStreams;  // ArrayList
    public class ClientHandle implements Runnable{
        BufferedReader reader;      // BufferedReader object
        Socket sock;                // Socket
        public ClientHandle(Socket clientSocket){
            try{
                sock=clientSocket;
                InputStreamReader isReader=new InputStreamReader(sock.getInputStream());    // InputStreamReader object
                reader=new BufferedReader(isReader);    // BufferedReader object
            }catch(Exception ex) {   // operate exception
                ex.printStackTrace();
            }
        }
        public void run(){
            String message; // message
            try{
                while((message=reader.readLine())!=null){   // read message
                    System.out.println("read "+message);    // print message
                    tellEveryone(message);
                }
            }catch(Exception ex) {   // operate exception
                ex.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        System.out.println("2014722057 김진아");   // print ID and name
        Server server=new Server(); // Server object
        server.go();      // move to go function
    }
    public void go(){
        clientOutputStreams=new ArrayList();             // ArrayList
        try{
            ServerSocket serverSocket=new ServerSocket(5000);   // listen for client advice
            while(true) {
                Socket clientSocket = serverSocket.accept();  // blocks until a request comes in
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());   // PrintWriter object
                clientOutputStreams.add(writer);    // add writer

                Thread thread=new Thread(new ClientHandle(clientSocket)); // make thread object
                thread.start(); // start thread
                System.out.println("got a connection");
            }
        }catch(IOException ex){ // operate IO exception
            ex.printStackTrace();
        }
    }
    public void tellEveryone(String message){
        Iterator it=clientOutputStreams.iterator();       // Iterator object
        while(it.hasNext()){
            try{
                PrintWriter writer=(PrintWriter)it.next();  // PrintWriter object
                writer.println(message);
                writer.flush();
            }catch(Exception ex) {   // operate exception
                ex.printStackTrace();
            }
        }
    }
}
