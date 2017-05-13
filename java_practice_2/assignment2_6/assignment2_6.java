/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class assignment2_6 {
    public static void main(String args[]){
        ArrayList<Integer> a_list=new ArrayList<Integer>();    // ArrayList object
        Scanner scan=new Scanner(System.in);    // Scanner object
        String command; // input command
        int num;    // number
        int i;  // index
        System.out.println("2014722057 김진아");   // print ID and name
        for(i=0;i<10;i++)   // add 10 numbers between 1 and 100
            a_list.add((int)(Math.random()*100)+1);
        while(true) {
            // print array list
            System.out.print("List: ");
            for (i = 0; i < a_list.size(); i++)
                System.out.print(a_list.get(i) + " ");
            System.out.println();
            // input user's command
            System.out.print("Input your command: ");
            command=scan.next();
            // input number
            if(command.equals("0"))    // end of input
                break;
            else if(command.equals("a")||command.equals("add")){   // add number
                while(true) {   // input number between 1 and 100
                    System.out.print("Input number to add: ");
                    num = scan.nextInt();
                    if(num>=1&&num<=100)
                        break;
                }
                a_list.add(num);
            }
            else if(command.equals("r")||command.equals("remove")){   // remove number
                while(true) {   // input number between 1 and 100
                    System.out.print("Input number to remove: ");
                    num = scan.nextInt();
                    if(num>=1&&num<=100)
                        break;
                }
                a_list.remove(a_list.indexOf(num));
            }
            else{   // search number
                while(true) {   // input number between 1 and 100
                    System.out.print("Input number to search: ");
                    num = scan.nextInt();
                    if(num>=1&&num<=100)
                        break;
                }
                System.out.println("Index of "+num+" is "+a_list.indexOf(num));
            }
            System.out.println();
        }
    }
}
