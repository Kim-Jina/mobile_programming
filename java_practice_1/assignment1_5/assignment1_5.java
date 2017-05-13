/**
 * Created by 진아 on 2016-10-01.
 */
import java.util.*;
public class assignment1_5 {
    public static void main(String args[]){
        int f_dice;         // the first dice
        int s_dice;         // the second dice
        int total=0;        // the number of rolls
        System.out.println("[assignment1_5] 2014722057 Kim Jin a");
        while(true){
            f_dice=(int)(Math.random()*6)+1;    // the value of the first dice
            s_dice=(int)(Math.random()*6)+1;    // the value of the second dice
            total+=1;   // increase total
            System.out.println("The first dice : "+f_dice+", The second dice: "+s_dice); // print values of dice
            if(f_dice+s_dice==2)        // come up snake eyes
                break;
        }
        System.out.println("The number of rolls: "+total);  // print the number of rolls
    }
}
