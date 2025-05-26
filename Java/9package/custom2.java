// how to create our own package
package in.pune;


public class custom2 {
    private int a;
    public custom2(int a){
        this.a=a;
    }
    public void getA(){
        System.out.println("a value from class ABC,"+a);
    }
    public static void main(String[] args){
        custom2 c=new custom2(123);
        c.getA();
    }
    
} // package ko combine karne ke liye hum javac -d . custom2 .java
// aise karne se package banega in jisme pune hoga and uske andar custom.class hoge
// to run it we write command java in.pune.custom2

