import java.io.*;

public class Bufferedreader5 {
    public static void main(String [] args) throws IOException{
BufferedReader br=new BufferedReader(new FileReader("first.txt"));
int x,count=0;
while((x=br.read())!=-1){
    System.out.print((char)x);
    count++;
}
System.out.println("Total number of character is"+count);
br.close();
    }
}
