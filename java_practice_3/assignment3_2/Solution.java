/**
 * Created by 진아 on 2016-11-06.
 */
import java.util.*;
public class Solution {
    public int solution(String S){
        int nest=0;                 // nest
        int count1=0,count2=0;      // count
        int i;                      // index
        if(S.equals("VW")||S.equals("vw"))  // S is vw of VW
            nest=1;
        else{
            for(i=0;i<S.length();i++) { // count ( and )
                if (S.charAt(i) == '(')
                    count1++;
                if(S.charAt(i)==')')
                    count2++;
            }
            if(count1==count2)  // (' count = )' count
                nest=1;
        }
        return nest;    // return nest
    }
}
