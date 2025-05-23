public class charset{
public static void main(String[] args){ // here string is a name of class avaiable in java api, args is variable of type string
    // 34 are non printable character
    for(int i=65;i<=90;i++){
        System.out.print((char)i+" "); // System is name of class available in lang package ,out is a class available in system it is statc variable 
    }
    System.out.println(); //println is a name of method available in printstreamd
    // datatypes are also the identifiers and keyword out of 53 keyword there are 7 datatypes that are keyword
    // java is strongly typed language becuase here we have to mention the datatype
    // javascript,python are weakly typed language beacuse here we dont have to mention the datatype
    // in java for constant values we use modifier final i.e final double pi=0;
    // final variable should be written in capital for example final double MAX_AGE=10
    // TWO TYPES OF DATA TYPES I JAVA :- 1 primitve type,2 reference type(class based)
    // java has 8 primitive data types
    // integers (4)- byte,short,int,long
// floating point types(2)- float,double  float has after . 7 precision  float is a single precison, double has more precision  after decimal we have maximum 15 precion double is double precioun
// character type(1)-char 
// boolean type -1
// default value of all type of integer =0 and for long =0L and default type=int
// if we write like this byte b=8;
// b=b+34(Then here we will get error because b is byte and 34 default type is int so we cant add them)
// so to solve this we do like this
// b=byte(b+34)
// default value =0.0f,0.0 and default type=double
// whenver we declare a float value we have to write float f=3.14f; else we get error
// character type is unsigned its size = 2B =16 bits =2^16 it is unicode, range 0-65536
//default value of character is ='\u0000'
// java doesnot give any size to boolean it is according to machine independent
// default value of boolean is false
}
}