/**
 * Created by 진아 on 2016-10-19.
 */
import java.util.*;

public class Tetrahedron extends ThreeDimensionalShape {
    private double Side;  // side
    public Tetrahedron(double side) {    // initialize Tetrahedron
        Side=side;
    }
    public void setSide(double side){    // set radius
        Side=side;
    }
    public double getSide(){ // get radius
        return Side;
    }
    public double getArea(){ // calculate the area of the three-dimensional shape
        return Math.sqrt(3)*Side*Side;
    }
    public double getVolume(){    // calculate the volume of the three-dimensional shape
        return Side*Side*Side*Math.sqrt(2)/12;
    }
    public void print(){        // print result
        System.out.println("Tetrahedron's area is "+String.format("%.3f",getArea())+", Tetrahedron's volume is "+String.format("%.3f",getVolume()));
    }
}
