// filereader and filewriter are not that much optimized and sugested beacuse they read each character at a time
//  bulk of data can be read using processing buffer
// bufferedWriter wrap Filewriter and write many data
// bufferedreader wrap FileReader and read many data
import java.io.*;
public class ProcessingBuffer4 {
    public static void main(String[] args) throws Exception{


//         FileWriter fw=new FileWriter("na.txt",true);
//  BufferedWriter bw=new BufferedWriter(fw);

 // we can do this 2 line work in a single line
 BufferedWriter br=new BufferedWriter(new FileWriter("nandi.txt",true));
 br.write("\n Java is an OOP language");
 br.write("Java is secure and dynamic/n Java is distributed and robust");
 br.close();
    }
    
}
