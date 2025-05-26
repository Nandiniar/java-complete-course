
package in.xyz;
public class XYZ {
    private int x;
    public XYZ(int x){
        this.x=x;
    }
    public void getv(){
        System.out.println("The value of x is"+x);
    }
    public static void main(String[] args){
        XYZ a=new XYZ(123);
        a.getv();
    }
    
}
