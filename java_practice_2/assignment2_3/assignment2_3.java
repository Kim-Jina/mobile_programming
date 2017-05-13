/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class assignment2_3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);    // Scanner object
        int total;  // total
        System.out.println("2014722057 김진아");   // print ID and name
        // enter the total between 2 and 12
        while(true) {
            System.out.print("Enter the total:");
            total=scan.nextInt();
            if(total>=2&&total<=12)
                break;
        }
        if(total==2)    // snake eyes
            System.out.println("It took "+NumberOfRoll(total)+" rolls to get snake eyes.");
        else            // no snake eyes
            System.out.println("the number of rolls is "+NumberOfRoll(total));
    }
    public static int NumberOfRoll(int total){
        int f_die,s_die;  // two die
        int sum,count=0;      // sum of f_die and s_die, rolling count
        // count the number of roll
        while(true){
            // roll a pair of die(die's number is between 1 and 6)
            f_die=(int)(Math.random()*6)+1;
            s_die=(int)(Math.random()*6)+1;
            sum=f_die+s_die;   // sum
            System.out.println("the first dice:"+f_die+", the second dice:"+s_die);
            count++;    // increase count
            if(sum==total||sum==2)  // if sum is equal to total, stop while statement
                break;
        }
        return count;
    }
}
