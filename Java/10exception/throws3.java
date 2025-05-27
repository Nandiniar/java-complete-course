// throws declaare an exception class
// throws can declare many exception
// use of throws
import java.io.*;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class throws3 {
    public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name and age");
    String name=null;
    int age=0;
    
    try{
   name=br.readLine();
    age=Integer.parseInt(br.readLine());
   
    }
    catch(Exception e){
        System.err.println(e);
    }
    finally{ // this is for closing the resources
        if(br!=null){
            System.out.println(br);
            br.close();
            System.out.println("Resource is closed");
        }

    }
System.out.println("Rest of the line is printed..............");
 System.out.println("name is"+name +"age is"+age);

    }
}
