/**
 * Created by 진아 on 2016-10-19.
 */
import java.util.*;

public class Square extends TwoDimensionalShape {
    private double Side;  // side
    public Square(double side) {    // initialize Square
        Side=side;
    }
    public void setSide(double side){    // set radius
        Side=side;
    }
    public double getSide(){ // get radius
        return Side;
    }
    public double getArea(){ // calculate the area of the two-dimensional shape
        return Side*Side;
    }
    public void print(){    // print result
        System.out.println("Square's area is "+String.format("%.3f",getArea()));
    }
}
