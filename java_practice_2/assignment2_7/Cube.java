/**
 * Created by 진아 on 2016-10-19.
 */
import java.util.*;

public class Cube extends ThreeDimensionalShape {
    private double Side;  // side
    public Cube(double side) {    // initialize Cube
        Side = side;
    }
    public void setSide(double side){    // set radius
        Side=side;
    }
    public double getSide(){ // get radius
        return Side;
    }
    public double getArea(){ // calculate the area of the three-dimensional shape
        return Side*Side*6;
    }
    public double getVolume(){    // calculate the volume of the three-dimensional shape
        return Side*Side*Side;
    }
    public void print(){        // print result
        System.out.println("Cube's area is "+String.format("%.3f",getArea())+", Cube's volume is "+String.format("%.3f",getVolume()));
    }
}
