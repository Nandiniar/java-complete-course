package in.hyd;

public class custom3 {
    private int x;
    public custom3(int x){
        this.x=x;
    }
    public void getv(){
        System.out.println("Value of x from custom3 is"+x);
    }
    public static void main(String[] args){
        custom3 c=new custom3(12);
      c.getv();
    }
}
