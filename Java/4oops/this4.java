public class this4 {
    // this is a reference varable refers to current object
    // this is used when the instanteous and local variable name are same
    private int sid;// instaneous varibale
    private String name; 
private String city; // yeh humne last me add kare hai
   public this4(int sid,String name){ // here sid,sname are local variable 
    this.sid=sid; // thismeans ke local ke value instaneous me ja rhe hai
    this.name=name;
   }
public void getValue(){
    System.out.println(sid+" "+name+" "+city);
}
   public this4(int sid,String name,String city){
    this(sid,name); // yeh hum phale wala use kar le issliye
    this.city=city;
   }
   public static void main(String[] args){
    this4 s1=new this4(23,"Nandini");
    s1.getValue();
    this4 s2=new this4(12,"Nandinia","ss");
    s2.getValue();
    


   }
}
// this() - this is constuctor it refers to the current class constructor
// this()
// this() can be use jab koi new chiz add karne ho and phale  wale chiz hume same copy karne ho
