/**
 * Created by 진아 on 2016-10-16.
 */
import java.util.*;

public class assignment2_7 {
    public static void main(String args[]){
        Shape shape[]=new Shape[6];  // Shape object
        int i;  // index
        System.out.println("2014722057 김진아");   // print ID and name
        // make an array of Shape references
        shape[0]=new Circle(5);
        shape[1]=new Square(9);
        shape[2]=new Triangle(4,3.15);
        shape[3]=new Sphere(4.13);
        shape[4]=new Cube(5.2);
        shape[5]=new Tetrahedron(7.5);
        // print result
        for(i=0;i<6;i++)
            shape[i].print();
    }
}
