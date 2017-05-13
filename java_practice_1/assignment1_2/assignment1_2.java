/**
 * Created by 진아 on 2016-10-01.
 */
import java.util.*;
public class assignment1_2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);    // declare Scanner object
        System.out.println("[assignment1_2] 2014722057 Kim Jin a");
        System.out.print("Enter the number: ");
        int rad=scan.nextInt(); // input the number
        int result=1;           // factorial of the number
        for(int i=rad;i>0;i--)  // calculate the factorial
            result*=i;
        System.out.println("Factorial of the number: "+result); // print result
    }
}