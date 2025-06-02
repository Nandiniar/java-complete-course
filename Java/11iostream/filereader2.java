// in this case we want to read the file

import java.io.*;
public class filereader2 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("first.txt");// if the file is present it will read it , otherwise the error will appear that file is not available
        // read() -reads a char and return int

        //  EOF(ENd of file) - return -1
        int x;
        int count=0;
        while((x=fr.read())!=-1){
System.out.print((char)x);
count++;
        }
        System.out.println();
        System.out.println("No of chars in the file: "+count);
        fr.close();

    }
}
