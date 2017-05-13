/**
 * Created by 진아 on 2016-11-06.
 */
import java.util.*;
public class assignment3_2 {
    public static void main(String args[]){
        System.out.println("2014722057 김진아");   // print ID and name
        Scanner scan=new Scanner(System.in); // Scanner object
        Solution solution=new Solution();    // Solution object
        String S;                             // String
        System.out.print("Enter the string: "); // enter the string
        S=scan.nextLine();
        // print result
        if(solution.solution(S)==1) // nest
            System.out.println(solution.solution(S)+": "+S+" is nested");
        else    // not nest
            System.out.println(solution.solution(S)+": "+S+" isn't nested");
    }
}
