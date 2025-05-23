// command line argumentj
public class argument2{
    public static void main(String[] args){
System.out.println(args[0]); // hum jav run kar rhe honge toh aise likhenge java argument2 nandini arora then ,iska output nandini aayega ,nandini arora command line argument hai , and yeh humare string me store honge
// here the value which will be pass will be of type string
System.out.println(args[0]+args[1]); // yeh string ke tarah add honge


/* how to convert argument type into string */
int a=Integer.parseInt(args[0]);// integer class is a wrapper class available in java.lang
int b=Integer.parseInt(args[1]);
System.out.println(a+b);

// using loops in command line argument
int sum=0;
for(int i=0;i<args.length;i++){
sum=sum+(Integer.parseInt(args[i]));
}
System.out.println(sum);

    }
}