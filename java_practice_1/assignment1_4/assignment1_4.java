/**
 * Created by 진아 on 2016-10-01.
 */
import java.util.*;
public class assignment1_4 {
    public static void main(String arg[]){
        int dice;       // number of dice
        int total=0;    // total roll
        System.out.println("[assignment1_4] 2014722057 Kim Jin a");
        for(int i=0;i<2;i++){
            if(i==0)    // the first dice
                System.out.print("The first ");
            else        // the second dice
                System.out.print("The second ");
            dice=(int)(Math.random()*6)+1;              // random number between 1 and 6
            System.out.println("die comes up "+dice);
            total+=dice;    // calculate total roll
        }
        System.out.println("Your total roll is "+total);
    }
}