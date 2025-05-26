public class constructor3 {
    // in a class we have can also have  more than 1 constructor and that is known as constuctor overloading
    // constructor overloading is possible when the 
    // 1 the parameters are different
    // 2 types are different
    //3 order of the params are differemnt
    int sno;
    String name;
    constructor3(){
System.out.println("Default constructor");
    }// defualr constructor
   public constructor3(int no,String sname){
    sno=no;
    name=sname;
    }
   public void getvalue(){
    System.out.println(sno+" "+name+" ");
   }
   public static void main(String[] args){
    constructor3 s1=new constructor3(21,"Nandini");
    s1.getvalue();
    constructor3 s2=new constructor3();
    s2.getvalue();
   }
}
