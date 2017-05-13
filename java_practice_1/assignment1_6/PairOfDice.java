/**
 * Created by 진아 on 2016-10-02.
 */
import java.util.*;
public class PairOfDice {
    public int die1;    // Number showing on the first die
    public int die2;    // Number showing on the second die
    public PairOfDice(){
        roll();    // call the roll() method to roll the dice
    }
    public void roll(){
        die1=(int)(Math.random()*6)+1;  // the value of the first die
        die2=(int)(Math.random()*6)+1;  // the value of the second die
    }
    public int getF_Die(){  // get the value of the first die
        return die1;
    }
    public int getS_Die(){  // get the value of the second die
        return die2;
    }
    public int getSum(){  // get total value
        return die1+die2;
    }
}
