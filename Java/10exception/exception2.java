// in this  finally,throw, throws



// finally  (it is use to close the resource if any is open)
// 1 try->finally
// 2 try->catch->finally



// throws is used to declare the exception class , using throws we can declare as many exceptions
// just like scanner , we can also read the data with the help of BUfferedReader
import java.io.*;
public class exception2 {
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter name and age");
        try{
                       String name=br.readLine();                 // readLine reads line of text
                       int age=Integer.parseInt(br.readLine());
                       System.out.println(name+" "+age);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
}
