/**
 * Created by 진아 on 2016-10-01.
 */
import java.util.*;
public class assignment1_3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);    // declare Scanner object
        int arr[]=new int[5];      // array
        int i,j,temp;               // index
        System.out.println("[assignment1_3] 2014722057 Kim Jin a");
        System.out.print("Enter five numbers: ");
        for(i=0;i<5;i++)       // input five numbers
            arr[i]=scan.nextInt();
        // insertion sort
        for(i=0;i<5;i++) {
            temp = arr[i];
            for (j = i; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted numbers: ");
        for(i=0;i<5;i++)                            // print sorted array
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
