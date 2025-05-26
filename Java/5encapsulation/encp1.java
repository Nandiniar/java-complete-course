// encpasulation is the wrraping of data and methods into a sngle unit
// tying together data member and methods another class and object cannot access it properly it access protection and data security
// there are  four types of  access modifiers - public , protected,default/ unspecified(means bas class ka name likh diha), private  
// for outer class we can only  give public and unspecified but the data members  and method which are inside it can be any of the four types
// but the outer class can only be public and unspeciifed
// public can be accessed from anywhere and private can be accessed only inside the class
// protected is used in case of inheritance when we have parent class and child class
// in encapuslation hum aapne data members ko access karte hai methods ke through so data members private honge
public class encp1 {
    private int sid;
    private String sname;
    private double gpa;
    private static String university="Standford";
// if all the data members are private then it is fully accessed
    // and the method should be public and constructor also

    public void setStudent(int id,String name,double agpa){ // setter
        sid=id;
        sname=name;
        gpa=agpa;



    }
    public void getStudent(){
        System.out.println("id is"+sid+"name is"+sname+"gpa is"+gpa+"university is"+university);



    }

    public static void main(String[] args){
        encp1 a=new encp1();
        a.setStudent(20,"ABC", 9.0);
        a.getStudent();

    }
}
