/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class assignment2_4 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);    // Scanner object
        int arr[]=new int[100];  // declare arr[100]
        int num,index=0;    // number, index
        System.out.println("2014722057 김진아");   // print ID and name
        // enter the number and save number into array
        System.out.print("Enter the number(1~100):");
        while(true){
            num=scan.nextInt(); // input number
            if(num==0)
                break;
            else if(num<0||num>100)
                continue;
            else
                arr[index++]=num;
        }
        // print array before sorting
        System.out.print("Before sorting : ");
        for(int i=0;i<index;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        InsertionSort(arr,index); // sort in ascending order
        // print array after sorting
        System.out.print("After sorting : ");
        for(int i=0;i<index;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void InsertionSort(int arr[],int index){    // insertion sort function
        int temp;    // temp
        for(int i=0;i<index;i++){
            temp=arr[i];
            for(int j=i-1;j>=0&&temp<arr[j];j--){
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
