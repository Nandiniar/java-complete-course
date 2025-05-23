public class classandobject1{

    int sid;// instance and int is primitive (declared in a class outside the function .methid) stored in heap memory/area
    String sname;// instance
    double gpa; //instance

    // three area spaaces are
    // Heap area- in this object are stored
    // class  area- all static variables will be stored here
    static String university="Standford";// static
    void setStudent(int id,String name,double avg){// here id,name,avg are local variables and they are stored in stack area
sid=id;
sname=name;
gpa=avg;
    }
    void getStudent(){
        System.out.println(sid+" "+sname+" "+gpa);
    }
}
// new Student() ywh constructor hota hai yeh heap me store hota hai