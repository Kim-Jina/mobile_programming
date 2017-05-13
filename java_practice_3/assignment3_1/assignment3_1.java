/**
 * Created by 진아 on 2016-11-06.
 */
import java.util.*;
public class assignment3_1 {
    public static void main(String args[]){
        System.out.println("2014722057 김진아");   // print ID and name
        Solution solution=new Solution();   // solution object
        Scanner scan=new Scanner(System.in);
        int[] A;        // array
        int N;          // array's length
        int count;      // count
        int i;          // index
        // enter the N
        System.out.print("N integer: ");
        N=scan.nextInt();
        A=new int[N];   // N array
        // enter the array's value
        System.out.print("Enter the array's value: ");
        for(i=0;i<N;i++){
            A[i]=scan.nextInt();
        }
        count=solution.solution(A);
        // print result
        if(count==1)
            System.out.println("There is "+count+" distinct value");
        else
            System.out.println("There are "+count+" distinct values");
    }
}
