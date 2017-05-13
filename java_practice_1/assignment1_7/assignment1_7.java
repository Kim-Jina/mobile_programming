/**
 * Created by 진아 on 2016-10-02.
 */
import java.util.*;
public class assignment1_7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);          // declare Scanner object
        System.out.println("[assignment1_7] 2014722057 Kim Jin a");
        System.out.print("Enter the user's name: ");
        String u_name = scan.nextLine();  // user's name
        // convert name to upper case letters and print below sentence
        System.out.println("Hello, " + u_name.toUpperCase() + ", nice to meet you!");
    }
}