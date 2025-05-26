// if in any language we have object and we dont use inheritance, then that class is known as object based like javacript
// java has inheritance that's why it is known as object priented
// java.lang.OBject is superclass of all classes it has no parents
//inheritance has is a relationship
// only the non private members of a class are inherited
//protected are used in inheritance
public class inheri1 {
private int eid;
private String ename;
private double basic;
private static String org="Gooogle";

public void setEmp(int eid,String ename,double basic){
    this.eid=eid;
    this.ename=ename;
    this.basic=basic;
}
public void disp(){
    System.out.println(eid+" "+ename+" "+basic+" ");
}
    
}
