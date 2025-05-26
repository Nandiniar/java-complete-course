// here we will link abc class and XYZ
package in; // if we want to import custom package you should be in a package
import in.abc.*;
import in.xyz.*;

public class drivercustom4 {
    public static void main(String[] args){
        ABC a=new ABC(123);
        a.getvalue();
        XYZ x=new XYZ(34);
        x.getv();
    }
}
