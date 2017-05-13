/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class assignment2_5 {
    public static void main(String args[]){
        cooking Cook;   // cooking object
        System.out.println("2014722057 김진아");   // print ID and name
        Cook=new cake();    // cake
        Cook.print();
        System.out.println();
        Cook=new coffee();  // coffee
        Cook.print();
        System.out.println();
        Cook=new dimsum();  // dimsum
        Cook.print();
        System.out.println();
        Cook=new dumpling();    // dumpling
        Cook.print();
        System.out.println();
        Cook=new friedchicken();    // friedchicken
        Cook.print();
        System.out.println();
        Cook=new icecream();    // icecream
        Cook.print();
        System.out.println();
        Cook=new noodle();  // noodle
        Cook.print();
        System.out.println();
        Cook=new pasta();   // pasta
        Cook.print();
        System.out.println();
        Cook=new pizza();   // pizza
        Cook.print();
        System.out.println();
        Cook=new steak();   // steak
        Cook.print();
        System.out.println();
    }
}
