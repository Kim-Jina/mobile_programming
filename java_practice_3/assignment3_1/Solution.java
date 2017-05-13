/**
 * Created by 진아 on 2016-11-06.
 */
import java.util.*;

public class Solution {
    public int solution(int[] A){
        int count=1;        // count
        int compare;
        int i,j;            // index
        Arrays.sort(A); // ascending sort
        compare=A[0];   // compare is A[0]'s value
        // count distinct values
        for(i=0;i<A.length;i++){
            if(A[i]!=compare) {
                compare=A[i];
                count++;    // increase count
            }
        }
        return count;   // return count
    }
}
