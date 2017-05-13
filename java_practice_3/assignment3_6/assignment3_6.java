/**
 * Created by 진아 on 2016-11-08.
 */
import java.io.*;
import java.util.*;
public class assignment3_6{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);                     // Scanner object
        ArrayList<File> arrayList= new ArrayList<File>();        // ArrayList
        File dir;                                                // directory
        String path;                                             // path
        int i,j;                                                // index
        System.out.println("2014722057 김진아");   // print ID and name
        System.out.print("Enter the path: ");      // enter the path
        path=scan.nextLine();
        System.out.println("====================================");
        dir=new File(path);     // make directory
        if(!dir.isDirectory()){ // directory doesn't exist
            System.out.println("Directory doesn't exist");
        }
        arrayList.add(dir); // add directory
        check_dir(dir,arrayList);   // check whether sub directory exists
        try{
            for(File file:arrayList){
                File[] dirContents=file.listFiles();    // directory's contents
                System.out.println("Directory: "+file.getName()+" ("+file.getCanonicalPath().toString()+")");
                for(File sub:dirContents){  // print file and sub directory in directory
                    System.out.print("=> ");
                    if(sub.isFile()){   // if file
                        System.out.println("File: "+sub.getName());
                    }
                    else if(sub.isDirectory()){ // if directory
                        System.out.println("Sub directory: "+sub.getName());
                    }
                }
            }
        }catch (Exception ex) {  // operate exception
            ex.printStackTrace();
        }
    }
    public static void check_dir(File dir,ArrayList<File> arrayList){   // check whether sub directory exists
        File[] sub_directory=dir.listFiles();   // sub directory
        int size=arrayList.size();             // ArrayList's size
        for(File file:sub_directory){
            if(file.isDirectory()){ // sub directory exists
                arrayList.add(file);
            }
        }
        for(int i=size;i<arrayList.size();i++) // go to check_dir function
            check_dir(arrayList.get(i),arrayList);
    }
}
