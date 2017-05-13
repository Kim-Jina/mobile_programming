/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class assignment2_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    // Scanner object
        int arr[],f_arr[];      // array, frequency array
        int len, how, sum = 0, temp, mode;    // length, how, sum, temp, mode
        double mean, median, s_deviation, dis=0; // arithmetic mean, median, standard deviation, distribution
        int i, j;      // index
        System.out.println("2014722057 김진아");   // print ID and name
        // input number of data points
        System.out.print("Enter number of data points:");
        len = scan.nextInt();
        arr = new int[len];   // declare arr[len]
        // enter the number how to input data
        System.out.print("How to input data (1.random, 2.keyboard):");
        how = scan.nextInt();
        // input array
        for (i = 0; i < len; i++) {
            System.out.print("[" + i + "]:");
            if (how == 1) {    // random
                arr[i] = (int) (Math.random()*100)+1;
                System.out.println(arr[i]);
            } else    // keyboard
                arr[i] = scan.nextInt();
        }
        // calculate arithmetic mean
        for (i = 0; i < len; i++)
            sum += arr[i];
        mean = (double)sum / len;
        // calculate mode
        f_arr = new int[len]; // declare f_arr[len]
        // calculate the frequency of array's number
        for (i = 0; i < len; i++) {
            sum = 0;  // initialize sum
            for (j = i; j < len; j++) {
                if(arr[i]==arr[j])
                    sum += 1;
            }
            f_arr[i] = sum;
        }
        mode = 0;  // initialize mode
        for (i = 0; i < len; i++) {    // find index
            if (f_arr[mode] < f_arr[i])
                mode = i;
        }
        mode=arr[mode];
        Arrays.sort(arr);   // sort array
        // calculate median
        if (len % 2 == 0)    // len is odd
            median = (double)(arr[(len / 2) - 1] + arr[len / 2]) / 2;
        else    // len is even
            median = arr[len / 2];
        // calculate distribution
        for(i=0;i<len;i++)
            dis+=(arr[i]-mean)*(arr[i]-mean);
        dis/=(len-1);
        s_deviation=Math.sqrt(dis); // calculate the standard deviation
        // print result
        System.out.println("Statistical Information:");
        System.out.println("==================================");
        System.out.println("Arithmetic mean:"+mean);
        System.out.println("Median:"+median);
        System.out.println("Mode:"+mode);
        System.out.println("Standard deviation:"+s_deviation);
    }
}
