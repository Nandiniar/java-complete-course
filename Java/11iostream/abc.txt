// now if we want to read from one file and write to another file , we will take both separate streams

import java.io.*;
public class filereaderdouble3 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("filereaderdouble3.java");
        FileWriter fw=new FileWriter("abc.txt");
        int x;
        int count=0;
        while((x=fr.read())!=-1){
            fw.write(x);
            System.out.print((char)x);
            count++;
        }
        System.out.println("File read and successfully written to abc.txt file");
        System.out.println("Total number of character are "+count);

        fr.close();
        fw.close();
    }
    
}
