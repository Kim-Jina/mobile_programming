/**
 * Created by 진아 on 2016-10-13.
 */
import java.util.*;

public class assignment2_1 {
    public static void main(String args[]){
        multiply m=new multiply();  // multiply object
        System.out.println("2014722057 김진아");  // print ID and name
        System.out.println("mul(2,3) -> "+ m.mul(2,3)); // calculate 2x3
        System.out.println("mul(2,3,4) -> "+ m.mul(2,3,4)); // calculate 2x3x4
        System.out.println("mul(1.5,2.5) -> "+m.mul(1.5,2.5));  // calculate 1.5x2.5
    }
}
