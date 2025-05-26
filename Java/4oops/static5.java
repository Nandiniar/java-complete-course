public class static5 {
    // static varibale are the common variable for whole class/ one value per class
    // static method can be called directly ,no need of creating object
    // static method can only access static member
    // this and supper does not exist in static method
    // static block will excute before main
    // static can be excuted to class , but that should be nested
    static String university="Standford";
    public static String cityname;
    static{  // this is known as static block -it exceuted during class loading
        cityname="Delhi";
        System.out.println("Static block is exceuted");
    }
public static5(){

}
public void getuniversity(){
    System.out.println("University name is :"+university+"City name is"+cityname);
}
    public static void change(){
        university="ABC";
        
    }
public static void main(String[] args){
    static5 s1=new static5();
    static5.change(); // this is a static method  which can be called without creatig the object 
    s1.getuniversity();

}
}
