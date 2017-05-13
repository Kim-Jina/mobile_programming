/**
 * Created by 진아 on 2016-10-19.
 */
import java.util.*;

public class Triangle extends TwoDimensionalShape {
    private double Width, Height;   // width, height
    public Triangle(double width, double height) {  // initialize Triangle
        Width=width;
        Height=height;
    }
    public void setWidth(double width){ // set width
        Width=width;
    }
    public void setHeight(double height){   // set height
        Height=height;
    }
    public double getWidth(){ // get width
        return Width;
    }
    public double getHeight(){   // get height
        return Height;
    }
    public double getArea(){ // calculate the area of the two-dimensional shape
        return Width*Height;
    }
    public void print(){    // print result
        System.out.println("Triangle's area is "+String.format("%.3f",getArea()));
    }
}
