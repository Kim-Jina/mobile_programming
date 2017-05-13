/**
 * Created by 진아 on 2016-10-01.
 */
import java.util.Scanner;
public class assignment1_1 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);    // declare Scanner object
        System.out.println("[assignment1_1] 2014722057 Kim Jin a");
        System.out.print("Please enter the radius of a circle: ");
        double rad=scan.nextDouble();    // input the radius of a circle
        double pi=3.141592;              // pi
        System.out.println("Area of a circle is "+rad*rad*pi);  // print area of a circle
    }
}