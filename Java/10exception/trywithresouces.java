// try with resources declare one or more resources
// resources  is an object that must be closed after the program is finished 
// resources like file,console streams,database,network sources
// we can use try with resource instead of finally
// try(resource1,resource2 ..){
// } RESOURCES WILL BE CLOSED OUTSIDE THE BLOCK
/// RESOURCES SHOULD BE Autoclosable


// readline ke saath IOException aata hai

import java.io.*;

public class trywithresouces {
    public static void main(String[] args)throws IOException{
     //   BufferedReader br=null; // resource
        try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){ // this is known as try with resources
           // br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name");
            String name=br.readLine();
            System.out.println("Hii" +name);
        }
catch(IOException e){
    System.out.println(e);
}

System.out.println("rest of the code follows............");
    }
    
}
// without final and catch we can use try only wirh the help of try with resources
