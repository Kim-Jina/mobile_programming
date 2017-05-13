/**
 * Created by 진아 on 2016-10-19.
 */
import java.util.*;

public class Sphere extends ThreeDimensionalShape {
    private double Rad;    // radius
    public Sphere(double rad) { // initialize Sphere
        Rad=rad;
    }
    public void setRad(double rad){    // set radius
        Rad=rad;
    }
    public double getRad(){ // get radius
        return Rad;
    }
    public double getArea(){ // calculate the area of the three-dimensional shape
        return Rad*Rad*4*3.141592;
    }
    public double getVolume(){    // calculate the volume of the three-dimensional shape
        return Rad*Rad*Rad*4/3*3.141592;
    }
    public void print(){        // print result
        System.out.println("Sphere's area is "+String.format("%.3f",getArea())+", Sphere's volume is "+String.format("%.3f",getVolume()));
    }
}
