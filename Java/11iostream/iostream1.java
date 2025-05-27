// stream is flow of information/data
// input streams means program is bringing the information from some source
// input streams means when we read the data
// output streams means  writting the data
// stream is of two types -text stream(character stream they are if 2 byte) and byte stream(binary stream they are of 1 byte)
//java.io classes contains all the streams import  java.io to use all these streams
// java has predefined byte stream : 1 System.in  2 System.out 3 System.err
// streams in java are objects 
// 2 directions(input/output) and 2 kind of streams(Text/Byte)
// 4 base classes dealing with I/O  -
//  1 Reader:text-input
// 2 Writer:text-output
// 3  InputStream - byte-input
// 4 OutputStream - byte-output
// all these are abstract classes
// file handling is reading and writting of data from files 


// classses and methods use for file filehandling  
//(1 and 2 are for text/char)
// 1 writer is an abstract class(filewritter) and can also use BufferedWriter(more processed)
// 2 reader is an abstract class(file readng ) and can also use BufferedReader(more processed)
// 3 Outputstream(FileoOUtputSTream)  and can also use BufferedOutputStream(for writer)
// 4 Inputstream(FileINputStream) and can also use BufferedInputStream(for reading)
import  java.io.*;
public class iostream1 {
    public static void main(String[] args){
        File f=new File("first.txt"); // yeh file bane hai java.io se  
        // iss wale command se humare file banege and agar koi phale se he bane hue hoge toh usme he rewrite hoke waise hoge
        try{
    FileWriter fw=new FileWriter(f);
    fw.write("Java is an OOP Language\n");
    fw.write("Java is a secure and dynamic \n Java is distributed and robust");


    fw.close();
        }
        catch(IOException e){
            System.err.println(e);
        }
System.out.println("File return Successfully");

    }
    
}
