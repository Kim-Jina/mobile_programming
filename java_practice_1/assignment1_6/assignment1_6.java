/**
 * Created by 진아 on 2016-10-01.
 */
import java.util.*;
public class assignment1_6 {
    public static void main(String args[]){
        PairOfDice dice=new PairOfDice();   // declare PairOfDice object
        int count=0;                        // roll count
        System.out.println("[assignment1_6] 2014722057 Kim Jin a");
        while(true){
            dice.roll(); // roll the dice
            count+=1;   // increase count
            // print values of the first dice and the second dice
            System.out.println("The first dice : "+dice.getF_Die()+", The second dice : "+dice.getS_Die());
            if(dice.getSum()==2)  // the total of the two dice is equal to two
                break;
        }
        System.out.println("The number of rolls is "+count);    // print the number of rolls
    }
}
