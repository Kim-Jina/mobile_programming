/**
 * Created by 진아 on 2016-10-19.
 */
import java.util.*;

public class Circle extends TwoDimensionalShape {
    private double Rad;    // radius
    public Circle(double rad) { // initialize Circle
        Rad=rad;
    }
    public void setRad(double rad){    // set radius
        Rad=rad;
    }
    public double getRad(){ // get radius
        return Rad;
    }
    public double getArea(){ // calculate the area of the two-dimensional shape
        return Rad*Rad*3.141592;
    }
    public void print(){    // print result
        System.out.println("Circle's area is "+String.format("%.3f",getArea()));
    }
}
