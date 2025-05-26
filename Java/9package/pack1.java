// package is a grouping of related types(class,interface) for example java .lang  package(java api is so  big)
// how to import  package - 1 implcit import, 2 explicit import,using FQN - Fully Qualified Name

// java package has lang,util.awt as its subpackage
// lang subpackage has system.class and string.class 
// util subpackage has arraylist.class and maplist.class
// awt subpackage has button.class
/// we can import using  1 import package.*; -means we are not tekling completely which package we want we import everything import java.util.*
/// 2 import package.classname  - ex - import java.util.Date;
/// 3 fully qualified name ex - java.util.Date
  import java.util.*; // this is implicit
import java.util.Date; // this is explicit
import java.util.Scanner; // this is for scanner
//java.util.Date; // THis is fullly qualified
public class pack1 {
    public static void main(String[] args){
java.util.Date d =new Date();  // d object is  created here for fully qualified here we have to write java.util.Date agar yeh use karenge toh kuch import karne ke requirement nhi hoge
System.out.println("Today's current time spam is "+d);
Scanner in=new Scanner(System.in); // this is done for taking input
System.out.println("Enter your good name");
String name=in.next();
System.out.println("Hello Mr/mrs");
Scanner a=new Scanner(System.in);
String n=a.next();
System.out.println("Hii this is ,"+n);
System.out.println("HIi");
System.out.println("PLease enter your text");
Scanner p=new Scanner(System.in);
String k=p.next();
System.out.println("Your last value is "+k);
    }
}
